package k01;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.glance.BitmapImageProvider;
import aw0.s8;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ix0.s0;
import jid.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f179908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f179909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Image f179910y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(z zVar, l lVar, Image image, int i, int i2, Continuation continuation, int i3) {
        super(2, continuation);
        this.u = i3;
        this.f179908w = zVar;
        this.f179909x = lVar;
        this.f179910y = image;
        this.z = i;
        this.A = i2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f179908w, this.f179909x, this.f179910y, this.z, this.A, continuation, 0);
            default:
                return new k(this.f179908w, this.f179909x, this.f179910y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ContextThemeWrapper contextThemeWrapper = this.f179909x.f179911a;
                    this.v = 1;
                    obj2 = this.f179908w.h(contextThemeWrapper, this.f179910y, this.z, this.A, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return new BitmapImageProvider((Bitmap) obj2);
            default:
                l lVar = this.f179909x;
                ContextThemeWrapper contextThemeWrapper2 = lVar.f179911a;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ContextThemeWrapper contextThemeWrapper3 = lVar.f179911a;
                    this.v = 1;
                    obj2 = this.f179908w.h(contextThemeWrapper3, this.f179910y, this.z, this.A, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Bitmap bitmap = (Bitmap) obj2;
                return new Pair(new BitmapImageProvider(bitmap), s0.d(new BitmapDrawable(contextThemeWrapper2.getResources(), bitmap), contextThemeWrapper2, s8.DEFAULT));
        }
    }
}
