package lu0;

import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardSearchView;
import ip0.u90;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardSearchView f199995b;

    public /* synthetic */ k(ReactionsKeyboardSearchView reactionsKeyboardSearchView, int i) {
        this.f199994a = i;
        this.f199995b = reactionsKeyboardSearchView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ihm.k kVar;
        int i = this.f199994a;
        ReactionsKeyboardSearchView reactionsKeyboardSearchView = this.f199995b;
        switch (i) {
            case 0:
                u90 it8 = (u90) obj2;
                ReactionsKeyboardSearchView.a aVar = ReactionsKeyboardSearchView.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                l lVar = reactionsKeyboardSearchView.f57496m;
                if (lVar != null && (kVar = lVar.f199997b) != null) {
                    kVar.onNext(it8);
                }
                return Unit.f186387a;
            case 1:
                ReactionsKeyboardSearchView.a aVar2 = ReactionsKeyboardSearchView.Companion;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                l lVar2 = reactionsKeyboardSearchView.f57496m;
                if (lVar2 != null) {
                    lVar2.f199998c.onNext(Unit.f186387a);
                }
                return Unit.f186387a;
            default:
                return ReactionsKeyboardSearchView.a(reactionsKeyboardSearchView, (Pair) obj2);
        }
    }
}
