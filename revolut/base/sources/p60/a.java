package p60;

import android.R;
import android.os.Parcelable;
import android.view.View;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import d01.b;
import gim.i;
import jh.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import py0.c;
import py0.f;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ KeyboardSuggestionsControllerExtension v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f233200w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension, String str, Continuation continuation) {
        super(2, continuation);
        this.v = keyboardSuggestionsControllerExtension;
        this.f233200w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, this.f233200w, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = (b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = new c(bVar.f110278b);
        KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = this.v;
        f fVarN0 = d.f(keyboardSuggestionsControllerExtension.f51200c.m2()).n0();
        com.revolut.kompot.navigable.a aVar2 = keyboardSuggestionsControllerExtension.f51200c;
        View viewFindViewById = aVar2.m2().findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = aVar2.m2().getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "getDecorView(...)");
        }
        TrackableItem.Companion companion = TrackableItem.INSTANCE;
        fVarN0.a(viewFindViewById, new CustomTrackableComponent((Parcelable) keyboardSuggestionsControllerExtension.d.get(this.f233200w), KeyboardSuggestionsControllerExtension.class), cVar);
        return Unit.f186387a;
    }
}
