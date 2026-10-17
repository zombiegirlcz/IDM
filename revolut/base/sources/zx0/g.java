package zx0;

import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zul.l0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325993a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r9i.e f325995c;

    public /* synthetic */ g(ReactionsKeyboardView reactionsKeyboardView, r9i.e eVar) {
        this.f325994b = reactionsKeyboardView;
        this.f325995c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarL;
        int i = this.f325993a;
        r9i.e eVar = this.f325995c;
        ReactionsKeyboardView reactionsKeyboardView = this.f325994b;
        switch (i) {
            case 0:
                String typeId = (String) obj2;
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter(typeId, "typeId");
                Intrinsics.checkNotNullParameter(typeId, "reactionTypeId");
                Intrinsics.checkNotNullParameter(typeId, "typeId");
                if (Intrinsics.f(typeId, "type_gif")) {
                    d0VarL = d0.m(q9i.d.f243909c);
                    Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
                } else if (Intrinsics.f(typeId, "type_sticker")) {
                    d0VarL = d0.m(q9i.d.f243909c);
                    Intrinsics.checkNotNullExpressionValue(d0VarL, "just(...)");
                } else {
                    d0VarL = d0.l(new IllegalStateException(j6.a.q("Unknown type id: ", typeId)));
                    Intrinsics.checkNotNullExpressionValue(d0VarL, "error(...)");
                }
                ufm.i iVar = new ufm.i(d0VarL, new r83.d(14, new qi3.i(1, eVar.f252733b, r9i.a.class, "mapCategories", "mapCategories(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return new ufm.i(ue0.e.I(iVar, h0.f322473a, new l0(7)), new b(new zp5.f(reactionsKeyboardView, typeId, 20), 8), 1);
            default:
                return ReactionsKeyboardView.e(reactionsKeyboardView, eVar, (yhm.r) obj2);
        }
    }

    public /* synthetic */ g(r9i.e eVar, ReactionsKeyboardView reactionsKeyboardView) {
        this.f325995c = eVar;
        this.f325994b = reactionsKeyboardView;
    }
}
