package m1c;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201386c;
    public final RevPointsTextWithLinks d;
    public final h0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f201387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f201388h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i0 f201389j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f201390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f201391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f201392n;
    public final k0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f201393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f201394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g0 f201395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f201396s;

    public l0(String id10, String title, String subtitle, RevPointsTextWithLinks description, h0 progress, String iconUrl, String ctaText, String str, String str2, i0 state, String reward, String campaignId, Integer num, Long l2, k0 k0Var, boolean z, boolean z3, g0 activationAction, List tags) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(activationAction, "activationAction");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f201384a = id10;
        this.f201385b = title;
        this.f201386c = subtitle;
        this.d = description;
        this.e = progress;
        this.f = iconUrl;
        this.f201387g = ctaText;
        this.f201388h = str;
        this.i = str2;
        this.f201389j = state;
        this.k = reward;
        this.f201390l = campaignId;
        this.f201391m = num;
        this.f201392n = l2;
        this.o = k0Var;
        this.f201393p = z;
        this.f201394q = z3;
        this.f201395r = activationAction;
        this.f201396s = tags;
    }

    public final boolean a() {
        return this.f201394q && this.f201395r == g0.JOIN_REVPOINTS && this.f201396s.contains(j0.CREDIT_CARD) && this.i != null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f201384a, l0Var.f201384a) && Intrinsics.f(this.f201385b, l0Var.f201385b) && Intrinsics.f(this.f201386c, l0Var.f201386c) && this.d.equals(l0Var.d) && this.e.equals(l0Var.e) && Intrinsics.f(this.f, l0Var.f) && Intrinsics.f(this.f201387g, l0Var.f201387g) && Intrinsics.f(this.f201388h, l0Var.f201388h) && Intrinsics.f(this.i, l0Var.i) && this.f201389j == l0Var.f201389j && Intrinsics.f(this.k, l0Var.k) && Intrinsics.f(this.f201390l, l0Var.f201390l) && Intrinsics.f(this.f201391m, l0Var.f201391m) && Intrinsics.f(this.f201392n, l0Var.f201392n) && Intrinsics.f(this.o, l0Var.o) && this.f201393p == l0Var.f201393p && this.f201394q == l0Var.f201394q && this.f201395r == l0Var.f201395r && Intrinsics.f(this.f201396s, l0Var.f201396s);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f201384a.hashCode() * 31, 31, this.f201385b), 31, this.f201386c)) * 31)) * 31, 31, this.f), 31, this.f201387g);
        String str = this.f201388h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iC2 = p.a.c(p.a.c((this.f201389j.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.k), 31, this.f201390l);
        Integer num = this.f201391m;
        int iHashCode2 = (iC2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.f201392n;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        k0 k0Var = this.o;
        return this.f201396s.hashCode() + ((this.f201395r.hashCode() + j6.a.c(j6.a.c((iHashCode3 + (k0Var != null ? k0Var.hashCode() : 0)) * 31, 31, this.f201393p), 31, this.f201394q)) * 31);
    }
}
