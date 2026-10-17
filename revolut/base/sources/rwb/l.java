package rwb;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru5.m;
import ru6.r;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardsCheckoutController$InputData f257891a;

    public l(RevPointsGiftcardsCheckoutController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f257891a = inputData;
    }

    public static n6 a(l lVar, TextLocalisedClause textLocalisedClause, LargeActionButton.ButtonStyle buttonStyle, String str, int i) {
        if ((i & 2) != 0) {
            buttonStyle = LargeActionButton.ButtonStyle.f58725a;
        }
        LargeActionButton.ButtonStyle buttonStyle2 = buttonStyle;
        boolean z = (i & 8) != 0;
        lVar.getClass();
        return new n6(textLocalisedClause, buttonStyle2, null, str, z, null, null, 972);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 1;
        final int i2 = 0;
        return new cii.b((aw0.i) iii.c.f(domainState.f257877a, new rrd.l(this, 16), new rl8.d(this, 16), new Function3(this) { // from class: rwb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f257888b;

            {
                this.f257888b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:113:0x0426  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0435  */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
                /*
                    Method dump skipped, instruction units count: 1190
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rwb.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }), (List) iii.c.f(domainState.f257877a, new r(this, 17), new m(16), new Function3(this) { // from class: rwb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f257888b;

            {
                this.f257888b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:113:0x0426  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0435  */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
                /*
                    Method dump skipped, instruction units count: 1190
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rwb.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }), new lw0.a(new TextLocalisedClause(R$string.gift_cards_details_checkout_title, null, null, 14), null, null, null, false, 30));
    }
}
