package h7;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ d7.j u;
    public final /* synthetic */ Context v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f149783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f149784x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d7.j jVar, Context context, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = jVar;
        this.v = context;
        this.f149783w = str;
        this.f149784x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.u, this.v, this.f149783w, this.f149784x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        for (k7.d dVar : this.u.f.values()) {
            Context context = this.v;
            Intrinsics.h(dVar);
            String str = dVar.f181760a;
            String str2 = dVar.f181762c;
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), this.f149783w + str + this.f149784x);
                try {
                    Intrinsics.h(typefaceCreateFromAsset);
                    Intrinsics.checkNotNullExpressionValue(str2, "getStyle(...)");
                    int i = 0;
                    boolean zJ = kotlin.text.d0.J(str2, "Italic", false);
                    boolean zJ2 = kotlin.text.d0.J(str2, "Bold", false);
                    if (zJ && zJ2) {
                        i = 3;
                    } else if (zJ) {
                        i = 2;
                    } else if (zJ2) {
                        i = 1;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                    }
                    dVar.d = typefaceCreateFromAsset;
                } catch (Exception unused) {
                    r7.c.f251932a.b();
                }
            } catch (Exception unused2) {
                r7.c.f251932a.b();
            }
        }
        return Unit.f186387a;
    }
}
