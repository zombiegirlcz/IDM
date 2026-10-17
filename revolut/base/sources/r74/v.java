package r74;

import android.content.Context;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$InputData;
import ip0.ej;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPromptScreenContract$InputData f252013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f252014b;

    public v(CreditPromptScreenContract$InputData inputData, q74.b creditNavigationIconMapper, a creditPromptItemMapper, Context context) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        Intrinsics.checkNotNullParameter(creditPromptItemMapper, "creditPromptItemMapper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f252013a = inputData;
        this.f252014b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.TextLocalisedClause a(ht3.i r18, java.util.List r19) {
        /*
            r0 = r18
            r1 = 1098907648(0x41800000, float:16.0)
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            int r1 = com.revolut.feature.credit.core.R$string.credit_prompt_link
            aim.e r8 = zhm.u.b()
            dx4.a1 r2 = r0.f155280b
            if (r2 == 0) goto L3e
            r3 = r2
            com.revolut.core.ui_kit.models.ImageClause r2 = new com.revolut.core.ui_kit.models.ImageClause
            int r3 = r3.c()
            int r4 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 16
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            r8.add(r2)
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.f186434a
            m70.a.t(r2)
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            java.lang.String r10 = " "
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.add(r9)
        L3e:
            java.lang.String r11 = r0.f155279a
            r2 = 0
            if (r19 == 0) goto L6c
            r3 = r19
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L4b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r3.next()
            r5 = r4
            ht3.e0 r5 = (ht3.e0) r5
            java.lang.String r5 = r5.f155265a
            java.lang.String r6 = r0.f155281c
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L4b
            goto L64
        L63:
            r4 = r2
        L64:
            ht3.e0 r4 = (ht3.e0) r4
            if (r4 == 0) goto L6c
            ht3.f0 r0 = r4.f155266b
            r15 = r0
            goto L6d
        L6c:
            r15 = r2
        L6d:
            com.revolut.core.ui_kit.models.Click r12 = new com.revolut.core.ui_kit.models.Click
            r13 = 28
            r14 = 0
            java.lang.String r16 = "INTRO_PROMPT_LINK_ITEM_ID"
            r17 = 0
            r12.<init>(r13, r14, r15, r16, r17)
            com.revolut.core.ui_kit.models.TextClause r10 = new com.revolut.core.ui_kit.models.TextClause
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 124(0x7c, float:1.74E-43)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r8.add(r10)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            aim.e r10 = zhm.u.a(r8)
            com.revolut.core.ui_kit.models.CompositeClause r9 = new com.revolut.core.ui_kit.models.CompositeClause
            r11 = 0
            r12 = 0
            r14 = 14
            r9.<init>(r10, r11, r12, r13, r14)
            java.util.List r0 = zhm.u.c(r9)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r4 = 12
            r3.<init>(r1, r0, r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r74.v.a(ht3.i, java.util.List):com.revolut.core.ui_kit.models.TextLocalisedClause");
    }

    public static LargeActionButton.ButtonStyle b(ht3.b bVar) {
        int i = u.f252012c[bVar.ordinal()];
        if (i == 1) {
            return LargeActionButton.ButtonStyle.f58725a;
        }
        if (i == 2) {
            return LargeActionButton.ButtonStyle.f58726b;
        }
        if (i == 3) {
            return LargeActionButton.ButtonStyle.o;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static ej d(ht3.k kVar) {
        Clause htmlClause;
        int i = u.f252011b[kVar.f155289b.ordinal()];
        if (i == 1) {
            htmlClause = new HtmlClause(1, 28, (Integer) null, (Object) null, kVar.f155288a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            htmlClause = new TextClause(kVar.f155288a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new ej("credit_prompt_content_footer", new c7(htmlClause, false, null, 6));
    }

    public static Media e(ht3.n nVar) {
        String str = nVar.f155291b;
        ht3.f fVar = nVar.d;
        String str2 = nVar.f155292c;
        if (str != null) {
            return com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, null, null, null, 30);
        }
        if (str2 != null) {
            int i = u.d[fVar.ordinal()];
            if (i == 1) {
                return new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            }
            if (i == 2) {
                return new UrlVideo(str2, (String) null, nVar.e, oz0.b.CENTER_CROP, false, (oz0.c) null, 114);
            }
            throw new NoWhenBranchMatchedException();
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        ht3.l lVar = nVar.f155290a;
        boolean z = nVar.e;
        StringBuilder sbM = v0.a.m("Can't map media from PromptMedia assetId=", str, ", url=", str2, ", contentType=");
        sbM.append(fVar);
        sbM.append(", mode=");
        sbM.append(lVar);
        sbM.append(", repeat=");
        sbM.append(z);
        rd0.d.a(cVar, "toUiKitMedia", sbM.toString(), null, h0Var);
        ColorImage.INSTANCE.getClass();
        return ColorImage.Companion.a();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f251990a, new r38.m(this, 18), new r6f.i(this, 3), new qbg.j(this, 19));
    }
}
