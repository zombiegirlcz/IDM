package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f166539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f166540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166541c;
    public final boolean d;
    public final String e;
    public final String f;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ tm0(com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.FilledButton r8, com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage r9, com.revolut.core.ui_kit.models.Clause r10, boolean r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 8
            if (r0 == 0) goto L5
            r11 = 1
        L5:
            r4 = r11
            r11 = r14 & 16
            r0 = 0
            if (r11 == 0) goto Ld
            r5 = r0
            goto Le
        Ld:
            r5 = r12
        Le:
            r11 = r14 & 32
            if (r11 == 0) goto L18
            r6 = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r0 = r7
            goto L1d
        L18:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
        L1d:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ip0.tm0.<init>(com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$FilledButton, com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage, com.revolut.core.ui_kit.models.Clause, boolean, java.lang.String, java.lang.String, int):void");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tm0)) {
            return false;
        }
        tm0 tm0Var = (tm0) obj2;
        return Intrinsics.f(this.f166539a, tm0Var.f166539a) && Intrinsics.f(this.f166540b, tm0Var.f166540b) && Intrinsics.f(this.f166541c, tm0Var.f166541c) && this.d == tm0Var.d && Intrinsics.f(this.e, tm0Var.e) && Intrinsics.f(this.f, tm0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f166539a.hashCode() * 31;
        Image image = this.f166540b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.f166541c;
        int iC = j6.a.c((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode3 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public tm0(LargeActionButton.ButtonStyle style, Image image, Clause clause, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f166539a = style;
        this.f166540b = image;
        this.f166541c = clause;
        this.d = z;
        this.e = str;
        this.f = str2;
    }
}
