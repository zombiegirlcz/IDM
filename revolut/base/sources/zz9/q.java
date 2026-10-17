package zz9;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;
import mx0.e4;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f326625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a f326626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f326627c;
    public final String d;
    public final e4 e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fu9.a f326628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f326629h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f326630j;
    public final NavBarWithContainerBackground k;

    public q(zm3.a contact, com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a chatState, s eligibility, String inputText, e4 inputViewState, n bottomBarState, fu9.a chatInputIconState, int i, boolean z, boolean z3, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(chatState, "chatState");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
        Intrinsics.checkNotNullParameter(bottomBarState, "bottomBarState");
        Intrinsics.checkNotNullParameter(chatInputIconState, "chatInputIconState");
        this.f326625a = contact;
        this.f326626b = chatState;
        this.f326627c = eligibility;
        this.d = inputText;
        this.e = inputViewState;
        this.f = bottomBarState;
        this.f326628g = chatInputIconState;
        this.f326629h = i;
        this.i = z;
        this.f326630j = z3;
        this.k = navBarWithContainerBackground;
    }

    public static q a(q qVar, com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a aVar, s sVar, String str, e4 e4Var, n nVar, fu9.a aVar2, int i, boolean z, int i2) {
        zm3.a contact = qVar.f326625a;
        if ((i2 & 2) != 0) {
            aVar = qVar.f326626b;
        }
        com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.a chatState = aVar;
        if ((i2 & 4) != 0) {
            sVar = qVar.f326627c;
        }
        s eligibility = sVar;
        String inputText = (i2 & 8) != 0 ? qVar.d : str;
        e4 inputViewState = (i2 & 16) != 0 ? qVar.e : e4Var;
        n bottomBarState = (i2 & 32) != 0 ? qVar.f : nVar;
        fu9.a chatInputIconState = (i2 & 64) != 0 ? qVar.f326628g : aVar2;
        int i3 = (i2 & 128) != 0 ? qVar.f326629h : i;
        boolean z3 = (i2 & 256) != 0 ? qVar.i : z;
        boolean z4 = qVar.f326630j;
        NavBarWithContainerBackground navBarWithContainerBackground = qVar.k;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(chatState, "chatState");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(inputViewState, "inputViewState");
        Intrinsics.checkNotNullParameter(bottomBarState, "bottomBarState");
        Intrinsics.checkNotNullParameter(chatInputIconState, "chatInputIconState");
        return new q(contact, chatState, eligibility, inputText, inputViewState, bottomBarState, chatInputIconState, i3, z3, z4, navBarWithContainerBackground);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f326625a, qVar.f326625a) && Intrinsics.f(this.f326626b, qVar.f326626b) && this.f326627c == qVar.f326627c && Intrinsics.f(this.d, qVar.d) && this.e == qVar.e && Intrinsics.f(this.f, qVar.f) && this.f326628g == qVar.f326628g && this.f326629h == qVar.f326629h && this.i == qVar.i && this.f326630j == qVar.f326630j && Intrinsics.f(this.k, qVar.k);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.b(this.f326629h, (this.f326628g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + p.a.c((this.f326627c.hashCode() + ((this.f326626b.hashCode() + (this.f326625a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31)) * 31, 31), 31, this.i), 31, this.f326630j);
        NavBarWithContainerBackground navBarWithContainerBackground = this.k;
        return iC + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode());
    }
}
