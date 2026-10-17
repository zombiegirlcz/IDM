package bs9;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.a4;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f18116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f18117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18118c;
    public final boolean d;
    public final boolean e;
    public final a4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cs9.b f18119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18120h;
    public final NavBarWithContainerBackground i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f18121j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f18122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final do3.n f18123m;

    public o(PaymentGroup group, Data contentData, boolean z, boolean z3, boolean z4, a4 chatInput, cs9.b chatInputIconState, int i, NavBarWithContainerBackground navBarWithContainerBackground, Data eligibility, boolean z6, List mentionPickerMembers, do3.n nVar) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        Intrinsics.checkNotNullParameter(chatInput, "chatInput");
        Intrinsics.checkNotNullParameter(chatInputIconState, "chatInputIconState");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        Intrinsics.checkNotNullParameter(mentionPickerMembers, "mentionPickerMembers");
        this.f18116a = group;
        this.f18117b = contentData;
        this.f18118c = z;
        this.d = z3;
        this.e = z4;
        this.f = chatInput;
        this.f18119g = chatInputIconState;
        this.f18120h = i;
        this.i = navBarWithContainerBackground;
        this.f18121j = eligibility;
        this.k = z6;
        this.f18122l = mentionPickerMembers;
        this.f18123m = nVar;
    }

    public static o a(o oVar, PaymentGroup paymentGroup, Data data, boolean z, boolean z3, boolean z4, a4 a4Var, cs9.b bVar, int i, Data data2, List list, do3.n nVar, int i2) {
        PaymentGroup group = (i2 & 1) != 0 ? oVar.f18116a : paymentGroup;
        Data contentData = (i2 & 2) != 0 ? oVar.f18117b : data;
        boolean z6 = (i2 & 4) != 0 ? oVar.f18118c : z;
        boolean z11 = (i2 & 8) != 0 ? oVar.d : z3;
        boolean z12 = (i2 & 16) != 0 ? oVar.e : z4;
        a4 chatInput = (i2 & 32) != 0 ? oVar.f : a4Var;
        cs9.b chatInputIconState = (i2 & 64) != 0 ? oVar.f18119g : bVar;
        int i3 = (i2 & 128) != 0 ? oVar.f18120h : i;
        NavBarWithContainerBackground navBarWithContainerBackground = oVar.i;
        Data eligibility = (i2 & 512) != 0 ? oVar.f18121j : data2;
        boolean z29 = oVar.k;
        List mentionPickerMembers = (i2 & 2048) != 0 ? oVar.f18122l : list;
        do3.n nVar2 = (i2 & 4096) != 0 ? oVar.f18123m : nVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        Intrinsics.checkNotNullParameter(chatInput, "chatInput");
        Intrinsics.checkNotNullParameter(chatInputIconState, "chatInputIconState");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        Intrinsics.checkNotNullParameter(mentionPickerMembers, "mentionPickerMembers");
        return new o(group, contentData, z6, z11, z12, chatInput, chatInputIconState, i3, navBarWithContainerBackground, eligibility, z29, mentionPickerMembers, nVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f18116a, oVar.f18116a) && Intrinsics.f(this.f18117b, oVar.f18117b) && this.f18118c == oVar.f18118c && this.d == oVar.d && this.e == oVar.e && Intrinsics.f(this.f, oVar.f) && this.f18119g == oVar.f18119g && this.f18120h == oVar.f18120h && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f18121j, oVar.f18121j) && this.k == oVar.k && Intrinsics.f(this.f18122l, oVar.f18122l) && Intrinsics.f(this.f18123m, oVar.f18123m);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f18120h, (this.f18119g.hashCode() + ((this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c(kii.e.c(this.f18117b, this.f18116a.hashCode() * 31, 31), 31, this.f18118c), 31, this.d), 31, this.e)) * 31)) * 31, 31);
        NavBarWithContainerBackground navBarWithContainerBackground = this.i;
        int iD = p.a.d(j6.a.c(kii.e.c(this.f18121j, (iB + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode())) * 31, 31), 31, this.k), 31, this.f18122l);
        do3.n nVar = this.f18123m;
        return iD + (nVar != null ? nVar.hashCode() : 0);
    }
}
