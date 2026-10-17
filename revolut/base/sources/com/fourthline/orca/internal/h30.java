package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaColors;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes23.dex */
public interface h30 {
    OrcaColors.OrcaColor a();

    OrcaColors.OrcaColor b();

    OrcaColors.OrcaColor c();

    OrcaColors.OrcaColor d();

    OrcaColors.OrcaColor e();

    OrcaColors.OrcaColor f();

    OrcaColors.OrcaColor g();

    OrcaColors.OrcaColor h();

    OrcaColors.OrcaColor i();

    OrcaColors.OrcaColor j();

    OrcaColors.OrcaColor k();

    OrcaColors.OrcaColor l();

    OrcaColors.OrcaColor m();

    public static final class a implements h30 {
        private final OrcaColors.OrcaColor A;
        private final OrcaColors.OrcaColor B;
        private final OrcaColors.OrcaColor C;
        private final OrcaColors.OrcaColor D;
        private final OrcaColors.OrcaColor E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29097c;
        private final OrcaColors.OrcaColor d;
        private final OrcaColors.OrcaColor e;
        private final OrcaColors.OrcaColor f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29099h;
        private final OrcaColors.OrcaColor i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29100j;
        private final OrcaColors.OrcaColor k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29101l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29102m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29103n;
        private final OrcaColors.OrcaColor o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29104p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29105q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29106r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29107s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29108t;
        private final OrcaColors.OrcaColor u;
        private final OrcaColors.OrcaColor v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29109w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29110x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29111y;
        private final OrcaColors.OrcaColor z;

        public a(OrcaColors.OrcaColor success, OrcaColors.OrcaColor danger, OrcaColors.OrcaColor warning, OrcaColors.OrcaColor caution, OrcaColors.OrcaColor info, OrcaColors.OrcaColor hint, OrcaColors.OrcaColor transparent, OrcaColors.OrcaColor white, OrcaColors.OrcaColor black, OrcaColors.OrcaColor dark90, OrcaColors.OrcaColor dark80, OrcaColors.OrcaColor dark70, OrcaColors.OrcaColor dark60, OrcaColors.OrcaColor dark50, OrcaColors.OrcaColor dark40, OrcaColors.OrcaColor dark30, OrcaColors.OrcaColor dark20, OrcaColors.OrcaColor dark10, OrcaColors.OrcaColor dark3, OrcaColors.OrcaColor light90, OrcaColors.OrcaColor light80, OrcaColors.OrcaColor light70, OrcaColors.OrcaColor light60, OrcaColors.OrcaColor light50, OrcaColors.OrcaColor light40, OrcaColors.OrcaColor light30, OrcaColors.OrcaColor light20, OrcaColors.OrcaColor light10, OrcaColors.OrcaColor light3, OrcaColors.OrcaColor neutral4, OrcaColors.OrcaColor neutral5) {
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(danger, "danger");
            Intrinsics.checkNotNullParameter(warning, "warning");
            Intrinsics.checkNotNullParameter(caution, "caution");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(transparent, "transparent");
            Intrinsics.checkNotNullParameter(white, "white");
            Intrinsics.checkNotNullParameter(black, "black");
            Intrinsics.checkNotNullParameter(dark90, "dark90");
            Intrinsics.checkNotNullParameter(dark80, "dark80");
            Intrinsics.checkNotNullParameter(dark70, "dark70");
            Intrinsics.checkNotNullParameter(dark60, "dark60");
            Intrinsics.checkNotNullParameter(dark50, "dark50");
            Intrinsics.checkNotNullParameter(dark40, "dark40");
            Intrinsics.checkNotNullParameter(dark30, "dark30");
            Intrinsics.checkNotNullParameter(dark20, "dark20");
            Intrinsics.checkNotNullParameter(dark10, "dark10");
            Intrinsics.checkNotNullParameter(dark3, "dark3");
            Intrinsics.checkNotNullParameter(light90, "light90");
            Intrinsics.checkNotNullParameter(light80, "light80");
            Intrinsics.checkNotNullParameter(light70, "light70");
            Intrinsics.checkNotNullParameter(light60, "light60");
            Intrinsics.checkNotNullParameter(light50, "light50");
            Intrinsics.checkNotNullParameter(light40, "light40");
            Intrinsics.checkNotNullParameter(light30, "light30");
            Intrinsics.checkNotNullParameter(light20, "light20");
            Intrinsics.checkNotNullParameter(light10, "light10");
            Intrinsics.checkNotNullParameter(light3, "light3");
            Intrinsics.checkNotNullParameter(neutral4, "neutral4");
            Intrinsics.checkNotNullParameter(neutral5, "neutral5");
            this.f29095a = success;
            this.f29096b = danger;
            this.f29097c = warning;
            this.d = caution;
            this.e = info;
            this.f = hint;
            this.f29098g = transparent;
            this.f29099h = white;
            this.i = black;
            this.f29100j = dark90;
            this.k = dark80;
            this.f29101l = dark70;
            this.f29102m = dark60;
            this.f29103n = dark50;
            this.o = dark40;
            this.f29104p = dark30;
            this.f29105q = dark20;
            this.f29106r = dark10;
            this.f29107s = dark3;
            this.f29108t = light90;
            this.u = light80;
            this.v = light70;
            this.f29109w = light60;
            this.f29110x = light50;
            this.f29111y = light40;
            this.z = light30;
            this.A = light20;
            this.B = light10;
            this.C = light3;
            this.D = neutral4;
            this.E = neutral5;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor a() {
            return this.f29107s;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor b() {
            return this.f29106r;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor c() {
            return this.f29097c;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor d() {
            return this.f29102m;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor e() {
            return this.D;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f29095a, aVar.f29095a) && Intrinsics.f(this.f29096b, aVar.f29096b) && Intrinsics.f(this.f29097c, aVar.f29097c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f29098g, aVar.f29098g) && Intrinsics.f(this.f29099h, aVar.f29099h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f29100j, aVar.f29100j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f29101l, aVar.f29101l) && Intrinsics.f(this.f29102m, aVar.f29102m) && Intrinsics.f(this.f29103n, aVar.f29103n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f29104p, aVar.f29104p) && Intrinsics.f(this.f29105q, aVar.f29105q) && Intrinsics.f(this.f29106r, aVar.f29106r) && Intrinsics.f(this.f29107s, aVar.f29107s) && Intrinsics.f(this.f29108t, aVar.f29108t) && Intrinsics.f(this.u, aVar.u) && Intrinsics.f(this.v, aVar.v) && Intrinsics.f(this.f29109w, aVar.f29109w) && Intrinsics.f(this.f29110x, aVar.f29110x) && Intrinsics.f(this.f29111y, aVar.f29111y) && Intrinsics.f(this.z, aVar.z) && Intrinsics.f(this.A, aVar.A) && Intrinsics.f(this.B, aVar.B) && Intrinsics.f(this.C, aVar.C) && Intrinsics.f(this.D, aVar.D) && Intrinsics.f(this.E, aVar.E);
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor f() {
            return this.f29098g;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor g() {
            return this.f29096b;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor h() {
            return this.E;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f29095a.hashCode() * 31) + this.f29096b.hashCode()) * 31) + this.f29097c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f29098g.hashCode()) * 31) + this.f29099h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f29100j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.f29101l.hashCode()) * 31) + this.f29102m.hashCode()) * 31) + this.f29103n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.f29104p.hashCode()) * 31) + this.f29105q.hashCode()) * 31) + this.f29106r.hashCode()) * 31) + this.f29107s.hashCode()) * 31) + this.f29108t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.f29109w.hashCode()) * 31) + this.f29110x.hashCode()) * 31) + this.f29111y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor i() {
            return this.f29095a;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor j() {
            return this.f29105q;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor k() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor l() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor m() {
            return this.f29099h;
        }

        public String toString() {
            return "Dark(success=" + this.f29095a + ", danger=" + this.f29096b + ", warning=" + this.f29097c + ", caution=" + this.d + ", info=" + this.e + ", hint=" + this.f + ", transparent=" + this.f29098g + ", white=" + this.f29099h + ", black=" + this.i + ", dark90=" + this.f29100j + ", dark80=" + this.k + ", dark70=" + this.f29101l + ", dark60=" + this.f29102m + ", dark50=" + this.f29103n + ", dark40=" + this.o + ", dark30=" + this.f29104p + ", dark20=" + this.f29105q + ", dark10=" + this.f29106r + ", dark3=" + this.f29107s + ", light90=" + this.f29108t + ", light80=" + this.u + ", light70=" + this.v + ", light60=" + this.f29109w + ", light50=" + this.f29110x + ", light40=" + this.f29111y + ", light30=" + this.z + ", light20=" + this.A + ", light10=" + this.B + ", light3=" + this.C + ", neutral4=" + this.D + ", neutral5=" + this.E + ")";
        }

        public /* synthetic */ a(OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaColors.OrcaColor orcaColor6, OrcaColors.OrcaColor orcaColor7, OrcaColors.OrcaColor orcaColor8, OrcaColors.OrcaColor orcaColor9, OrcaColors.OrcaColor orcaColor10, OrcaColors.OrcaColor orcaColor11, OrcaColors.OrcaColor orcaColor12, OrcaColors.OrcaColor orcaColor13, OrcaColors.OrcaColor orcaColor14, OrcaColors.OrcaColor orcaColor15, OrcaColors.OrcaColor orcaColor16, OrcaColors.OrcaColor orcaColor17, OrcaColors.OrcaColor orcaColor18, OrcaColors.OrcaColor orcaColor19, OrcaColors.OrcaColor orcaColor20, OrcaColors.OrcaColor orcaColor21, OrcaColors.OrcaColor orcaColor22, OrcaColors.OrcaColor orcaColor23, OrcaColors.OrcaColor orcaColor24, OrcaColors.OrcaColor orcaColor25, OrcaColors.OrcaColor orcaColor26, OrcaColors.OrcaColor orcaColor27, OrcaColors.OrcaColor orcaColor28, OrcaColors.OrcaColor orcaColor29, OrcaColors.OrcaColor orcaColor30, OrcaColors.OrcaColor orcaColor31, int i, DefaultConstructorMarker defaultConstructorMarker) {
            OrcaColors.OrcaColor orcaColor32;
            OrcaColors.OrcaColor orcaColor33;
            OrcaColors.OrcaColor fromLong;
            OrcaColors.OrcaColor orcaColor34;
            OrcaColors.OrcaColor fromLong2;
            OrcaColors.OrcaColor orcaColor35;
            OrcaColors.OrcaColor fromLong3;
            OrcaColors.OrcaColor orcaColor36;
            OrcaColors.OrcaColor orcaColor37;
            OrcaColors.OrcaColor fromLong4;
            OrcaColors.OrcaColor orcaColor38;
            OrcaColors.OrcaColor fromLong5;
            OrcaColors.OrcaColor orcaColor39;
            OrcaColors.OrcaColor orcaColor40;
            OrcaColors.OrcaColor fromLong6;
            OrcaColors.OrcaColor orcaColor41;
            OrcaColors.OrcaColor fromLong7;
            OrcaColors.OrcaColor orcaColor42;
            OrcaColors.OrcaColor orcaColor43;
            OrcaColors.OrcaColor fromLong8;
            OrcaColors.OrcaColor orcaColor44;
            OrcaColors.OrcaColor fromLong9;
            OrcaColors.OrcaColor orcaColor45;
            OrcaColors.OrcaColor orcaColor46;
            OrcaColors.OrcaColor fromLong10;
            OrcaColors.OrcaColor orcaColor47;
            OrcaColors.OrcaColor fromLong11;
            OrcaColors.OrcaColor fromLong12;
            OrcaColors.OrcaColor orcaColor48;
            OrcaColors.OrcaColor orcaColor49;
            OrcaColors.OrcaColor orcaColor50;
            OrcaColors.OrcaColor orcaColor51;
            OrcaColors.OrcaColor orcaColor52;
            OrcaColors.OrcaColor orcaColor53;
            OrcaColors.OrcaColor orcaColor54;
            OrcaColors.OrcaColor orcaColor55;
            OrcaColors.OrcaColor orcaColor56;
            OrcaColors.OrcaColor orcaColor57;
            OrcaColors.OrcaColor orcaColor58;
            OrcaColors.OrcaColor orcaColor59;
            OrcaColors.OrcaColor orcaColor60;
            OrcaColors.OrcaColor orcaColor61;
            OrcaColors.OrcaColor orcaColor62;
            OrcaColors.OrcaColor orcaColor63;
            OrcaColors.OrcaColor orcaColor64;
            OrcaColors.OrcaColor orcaColor65;
            OrcaColors.OrcaColor orcaColor66;
            OrcaColors.OrcaColor orcaColor67;
            OrcaColors.OrcaColor orcaColor68;
            OrcaColors.OrcaColor orcaColor69;
            OrcaColors.OrcaColor orcaColor70;
            OrcaColors.OrcaColor orcaColor71;
            OrcaColors.OrcaColor orcaColor72;
            OrcaColors.OrcaColor orcaColor73;
            OrcaColors.OrcaColor orcaColor74;
            OrcaColors.OrcaColor orcaColor75;
            OrcaColors.OrcaColor orcaColor76;
            OrcaColors.OrcaColor orcaColor77;
            OrcaColors.OrcaColor fromInt = (i & 1) != 0 ? new OrcaColors.OrcaColor.FromInt(57442) : orcaColor;
            OrcaColors.OrcaColor fromInt2 = (i & 2) != 0 ? new OrcaColors.OrcaColor.FromInt(15834011) : orcaColor2;
            OrcaColors.OrcaColor fromInt3 = (i & 4) != 0 ? new OrcaColors.OrcaColor.FromInt(16750675) : orcaColor3;
            OrcaColors.OrcaColor fromInt4 = (i & 8) != 0 ? new OrcaColors.OrcaColor.FromInt(16764672) : orcaColor4;
            OrcaColors.OrcaColor fromInt5 = (i & 16) != 0 ? new OrcaColors.OrcaColor.FromInt(3952740) : orcaColor5;
            OrcaColors.OrcaColor fromInt6 = (i & 32) != 0 ? new OrcaColors.OrcaColor.FromInt(4085871) : orcaColor6;
            OrcaColors.OrcaColor fromLong13 = (i & 64) != 0 ? new OrcaColors.OrcaColor.FromLong(0L) : orcaColor7;
            OrcaColors.OrcaColor fromInt7 = (i & 128) != 0 ? new OrcaColors.OrcaColor.FromInt(16777215) : orcaColor8;
            OrcaColors.OrcaColor fromInt8 = (i & 256) != 0 ? new OrcaColors.OrcaColor.FromInt(0) : orcaColor9;
            OrcaColors.OrcaColor fromLong14 = (i & 512) != 0 ? new OrcaColors.OrcaColor.FromLong(3875536895L) : orcaColor10;
            OrcaColors.OrcaColor fromLong15 = (i & 1024) != 0 ? new OrcaColors.OrcaColor.FromLong(3439329279L) : orcaColor11;
            OrcaColors.OrcaColor fromLong16 = (i & 2048) != 0 ? new OrcaColors.OrcaColor.FromLong(3019898879L) : orcaColor12;
            OrcaColors.OrcaColor fromLong17 = (i & 4096) != 0 ? new OrcaColors.OrcaColor.FromLong(2583691263L) : orcaColor13;
            if ((i & 8192) != 0) {
                orcaColor32 = fromInt;
                orcaColor33 = fromInt2;
                fromLong = new OrcaColors.OrcaColor.FromLong(2164260863L);
            } else {
                orcaColor32 = fromInt;
                orcaColor33 = fromInt2;
                fromLong = orcaColor14;
            }
            OrcaColors.OrcaColor fromLong18 = (i & 16384) != 0 ? new OrcaColors.OrcaColor.FromLong(1728053247L) : orcaColor15;
            OrcaColors.OrcaColor fromLong19 = (i & 32768) != 0 ? new OrcaColors.OrcaColor.FromLong(1308622847L) : orcaColor16;
            if ((i & 65536) != 0) {
                orcaColor34 = fromLong18;
                fromLong2 = new OrcaColors.OrcaColor.FromLong(872415231L);
            } else {
                orcaColor34 = fromLong18;
                fromLong2 = orcaColor17;
            }
            if ((i & 131072) != 0) {
                orcaColor35 = fromInt3;
                fromLong3 = new OrcaColors.OrcaColor.FromLong(452984831L);
            } else {
                orcaColor35 = fromInt3;
                fromLong3 = orcaColor18;
            }
            if ((i & 262144) != 0) {
                orcaColor36 = fromLong2;
                orcaColor37 = fromLong3;
                fromLong4 = new OrcaColors.OrcaColor.FromLong(150994943L);
            } else {
                orcaColor36 = fromLong2;
                orcaColor37 = fromLong3;
                fromLong4 = orcaColor19;
            }
            if ((i & 524288) != 0) {
                orcaColor38 = fromLong4;
                fromLong5 = new OrcaColors.OrcaColor.FromLong(3858759680L);
            } else {
                orcaColor38 = fromLong4;
                fromLong5 = orcaColor20;
            }
            OrcaColors.OrcaColor fromLong20 = (i & PKIFailureInfo.badCertTemplate) != 0 ? new OrcaColors.OrcaColor.FromLong(3422552064L) : orcaColor21;
            if ((i & PKIFailureInfo.badSenderNonce) != 0) {
                orcaColor39 = fromLong5;
                orcaColor40 = fromLong20;
                fromLong6 = new OrcaColors.OrcaColor.FromLong(3003121664L);
            } else {
                orcaColor39 = fromLong5;
                orcaColor40 = fromLong20;
                fromLong6 = orcaColor22;
            }
            if ((i & 4194304) != 0) {
                orcaColor41 = fromLong6;
                fromLong7 = new OrcaColors.OrcaColor.FromLong(2566914048L);
            } else {
                orcaColor41 = fromLong6;
                fromLong7 = orcaColor23;
            }
            OrcaColors.OrcaColor fromLong21 = (i & 8388608) != 0 ? new OrcaColors.OrcaColor.FromLong(2147483648L) : orcaColor24;
            if ((i & 16777216) != 0) {
                orcaColor42 = fromLong7;
                orcaColor43 = fromLong21;
                fromLong8 = new OrcaColors.OrcaColor.FromLong(1711276032L);
            } else {
                orcaColor42 = fromLong7;
                orcaColor43 = fromLong21;
                fromLong8 = orcaColor25;
            }
            if ((i & 33554432) != 0) {
                orcaColor44 = fromLong8;
                fromLong9 = new OrcaColors.OrcaColor.FromLong(1291845632L);
            } else {
                orcaColor44 = fromLong8;
                fromLong9 = orcaColor26;
            }
            OrcaColors.OrcaColor fromLong22 = (i & 67108864) != 0 ? new OrcaColors.OrcaColor.FromLong(855638016L) : orcaColor27;
            if ((i & 134217728) != 0) {
                orcaColor45 = fromLong9;
                orcaColor46 = fromLong22;
                fromLong10 = new OrcaColors.OrcaColor.FromLong(436207616L);
            } else {
                orcaColor45 = fromLong9;
                orcaColor46 = fromLong22;
                fromLong10 = orcaColor28;
            }
            if ((i & 268435456) != 0) {
                orcaColor47 = fromLong10;
                fromLong11 = new OrcaColors.OrcaColor.FromLong(134217728L);
            } else {
                orcaColor47 = fromLong10;
                fromLong11 = orcaColor29;
            }
            OrcaColors.OrcaColor fromLong23 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? new OrcaColors.OrcaColor.FromLong(1728053247L) : orcaColor30;
            if ((i & 1073741824) != 0) {
                orcaColor48 = fromLong11;
                orcaColor49 = fromLong23;
                fromLong12 = new OrcaColors.OrcaColor.FromLong(4280693828L);
                orcaColor51 = orcaColor36;
                orcaColor52 = orcaColor37;
                orcaColor53 = orcaColor38;
                orcaColor54 = orcaColor39;
                orcaColor55 = orcaColor40;
                orcaColor56 = orcaColor41;
                orcaColor57 = orcaColor42;
                orcaColor58 = orcaColor43;
                orcaColor59 = orcaColor44;
                orcaColor60 = orcaColor45;
                orcaColor61 = orcaColor46;
                orcaColor62 = orcaColor47;
                orcaColor63 = orcaColor35;
                orcaColor64 = fromInt5;
                orcaColor65 = fromInt6;
                orcaColor66 = fromLong13;
                orcaColor67 = fromInt7;
                orcaColor68 = fromInt8;
                orcaColor69 = fromLong14;
                orcaColor70 = fromLong15;
                orcaColor71 = fromLong16;
                orcaColor72 = fromLong17;
                orcaColor73 = fromLong;
                orcaColor74 = fromLong19;
                orcaColor50 = orcaColor33;
                orcaColor76 = orcaColor34;
                orcaColor77 = fromInt4;
                orcaColor75 = orcaColor32;
            } else {
                fromLong12 = orcaColor31;
                orcaColor48 = fromLong11;
                orcaColor49 = fromLong23;
                orcaColor50 = orcaColor33;
                orcaColor51 = orcaColor36;
                orcaColor52 = orcaColor37;
                orcaColor53 = orcaColor38;
                orcaColor54 = orcaColor39;
                orcaColor55 = orcaColor40;
                orcaColor56 = orcaColor41;
                orcaColor57 = orcaColor42;
                orcaColor58 = orcaColor43;
                orcaColor59 = orcaColor44;
                orcaColor60 = orcaColor45;
                orcaColor61 = orcaColor46;
                orcaColor62 = orcaColor47;
                orcaColor63 = orcaColor35;
                orcaColor64 = fromInt5;
                orcaColor65 = fromInt6;
                orcaColor66 = fromLong13;
                orcaColor67 = fromInt7;
                orcaColor68 = fromInt8;
                orcaColor69 = fromLong14;
                orcaColor70 = fromLong15;
                orcaColor71 = fromLong16;
                orcaColor72 = fromLong17;
                orcaColor73 = fromLong;
                orcaColor74 = fromLong19;
                orcaColor75 = orcaColor32;
                orcaColor76 = orcaColor34;
                orcaColor77 = fromInt4;
            }
            this(orcaColor75, orcaColor50, orcaColor63, orcaColor77, orcaColor64, orcaColor65, orcaColor66, orcaColor67, orcaColor68, orcaColor69, orcaColor70, orcaColor71, orcaColor72, orcaColor73, orcaColor76, orcaColor74, orcaColor51, orcaColor52, orcaColor53, orcaColor54, orcaColor55, orcaColor56, orcaColor57, orcaColor58, orcaColor59, orcaColor60, orcaColor61, orcaColor62, orcaColor48, orcaColor49, fromLong12);
        }
    }

    public static final class b implements h30 {
        private final OrcaColors.OrcaColor A;
        private final OrcaColors.OrcaColor B;
        private final OrcaColors.OrcaColor C;
        private final OrcaColors.OrcaColor D;
        private final OrcaColors.OrcaColor E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29114c;
        private final OrcaColors.OrcaColor d;
        private final OrcaColors.OrcaColor e;
        private final OrcaColors.OrcaColor f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29116h;
        private final OrcaColors.OrcaColor i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29117j;
        private final OrcaColors.OrcaColor k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29118l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29119m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29120n;
        private final OrcaColors.OrcaColor o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29121p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29122q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29123r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29124s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29125t;
        private final OrcaColors.OrcaColor u;
        private final OrcaColors.OrcaColor v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29126w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29127x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final OrcaColors.OrcaColor f29128y;
        private final OrcaColors.OrcaColor z;

        public b(OrcaColors.OrcaColor success, OrcaColors.OrcaColor danger, OrcaColors.OrcaColor warning, OrcaColors.OrcaColor caution, OrcaColors.OrcaColor info, OrcaColors.OrcaColor hint, OrcaColors.OrcaColor transparent, OrcaColors.OrcaColor white, OrcaColors.OrcaColor black, OrcaColors.OrcaColor dark90, OrcaColors.OrcaColor dark80, OrcaColors.OrcaColor dark70, OrcaColors.OrcaColor dark60, OrcaColors.OrcaColor dark50, OrcaColors.OrcaColor dark40, OrcaColors.OrcaColor dark30, OrcaColors.OrcaColor dark20, OrcaColors.OrcaColor dark10, OrcaColors.OrcaColor dark3, OrcaColors.OrcaColor light90, OrcaColors.OrcaColor light80, OrcaColors.OrcaColor light70, OrcaColors.OrcaColor light60, OrcaColors.OrcaColor light50, OrcaColors.OrcaColor light40, OrcaColors.OrcaColor light30, OrcaColors.OrcaColor light20, OrcaColors.OrcaColor light10, OrcaColors.OrcaColor light3, OrcaColors.OrcaColor neutral4, OrcaColors.OrcaColor neutral5) {
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(danger, "danger");
            Intrinsics.checkNotNullParameter(warning, "warning");
            Intrinsics.checkNotNullParameter(caution, "caution");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(transparent, "transparent");
            Intrinsics.checkNotNullParameter(white, "white");
            Intrinsics.checkNotNullParameter(black, "black");
            Intrinsics.checkNotNullParameter(dark90, "dark90");
            Intrinsics.checkNotNullParameter(dark80, "dark80");
            Intrinsics.checkNotNullParameter(dark70, "dark70");
            Intrinsics.checkNotNullParameter(dark60, "dark60");
            Intrinsics.checkNotNullParameter(dark50, "dark50");
            Intrinsics.checkNotNullParameter(dark40, "dark40");
            Intrinsics.checkNotNullParameter(dark30, "dark30");
            Intrinsics.checkNotNullParameter(dark20, "dark20");
            Intrinsics.checkNotNullParameter(dark10, "dark10");
            Intrinsics.checkNotNullParameter(dark3, "dark3");
            Intrinsics.checkNotNullParameter(light90, "light90");
            Intrinsics.checkNotNullParameter(light80, "light80");
            Intrinsics.checkNotNullParameter(light70, "light70");
            Intrinsics.checkNotNullParameter(light60, "light60");
            Intrinsics.checkNotNullParameter(light50, "light50");
            Intrinsics.checkNotNullParameter(light40, "light40");
            Intrinsics.checkNotNullParameter(light30, "light30");
            Intrinsics.checkNotNullParameter(light20, "light20");
            Intrinsics.checkNotNullParameter(light10, "light10");
            Intrinsics.checkNotNullParameter(light3, "light3");
            Intrinsics.checkNotNullParameter(neutral4, "neutral4");
            Intrinsics.checkNotNullParameter(neutral5, "neutral5");
            this.f29112a = success;
            this.f29113b = danger;
            this.f29114c = warning;
            this.d = caution;
            this.e = info;
            this.f = hint;
            this.f29115g = transparent;
            this.f29116h = white;
            this.i = black;
            this.f29117j = dark90;
            this.k = dark80;
            this.f29118l = dark70;
            this.f29119m = dark60;
            this.f29120n = dark50;
            this.o = dark40;
            this.f29121p = dark30;
            this.f29122q = dark20;
            this.f29123r = dark10;
            this.f29124s = dark3;
            this.f29125t = light90;
            this.u = light80;
            this.v = light70;
            this.f29126w = light60;
            this.f29127x = light50;
            this.f29128y = light40;
            this.z = light30;
            this.A = light20;
            this.B = light10;
            this.C = light3;
            this.D = neutral4;
            this.E = neutral5;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor a() {
            return this.f29124s;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor b() {
            return this.f29123r;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor c() {
            return this.f29114c;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor d() {
            return this.f29119m;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor e() {
            return this.D;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f29112a, bVar.f29112a) && Intrinsics.f(this.f29113b, bVar.f29113b) && Intrinsics.f(this.f29114c, bVar.f29114c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f29115g, bVar.f29115g) && Intrinsics.f(this.f29116h, bVar.f29116h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f29117j, bVar.f29117j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f29118l, bVar.f29118l) && Intrinsics.f(this.f29119m, bVar.f29119m) && Intrinsics.f(this.f29120n, bVar.f29120n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f29121p, bVar.f29121p) && Intrinsics.f(this.f29122q, bVar.f29122q) && Intrinsics.f(this.f29123r, bVar.f29123r) && Intrinsics.f(this.f29124s, bVar.f29124s) && Intrinsics.f(this.f29125t, bVar.f29125t) && Intrinsics.f(this.u, bVar.u) && Intrinsics.f(this.v, bVar.v) && Intrinsics.f(this.f29126w, bVar.f29126w) && Intrinsics.f(this.f29127x, bVar.f29127x) && Intrinsics.f(this.f29128y, bVar.f29128y) && Intrinsics.f(this.z, bVar.z) && Intrinsics.f(this.A, bVar.A) && Intrinsics.f(this.B, bVar.B) && Intrinsics.f(this.C, bVar.C) && Intrinsics.f(this.D, bVar.D) && Intrinsics.f(this.E, bVar.E);
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor f() {
            return this.f29115g;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor g() {
            return this.f29113b;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor h() {
            return this.E;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f29112a.hashCode() * 31) + this.f29113b.hashCode()) * 31) + this.f29114c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f29115g.hashCode()) * 31) + this.f29116h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f29117j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.f29118l.hashCode()) * 31) + this.f29119m.hashCode()) * 31) + this.f29120n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.f29121p.hashCode()) * 31) + this.f29122q.hashCode()) * 31) + this.f29123r.hashCode()) * 31) + this.f29124s.hashCode()) * 31) + this.f29125t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.f29126w.hashCode()) * 31) + this.f29127x.hashCode()) * 31) + this.f29128y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor i() {
            return this.f29112a;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor j() {
            return this.f29122q;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor k() {
            return this.d;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor l() {
            return this.e;
        }

        @Override // com.fourthline.orca.internal.h30
        public OrcaColors.OrcaColor m() {
            return this.f29116h;
        }

        public String toString() {
            return "Light(success=" + this.f29112a + ", danger=" + this.f29113b + ", warning=" + this.f29114c + ", caution=" + this.d + ", info=" + this.e + ", hint=" + this.f + ", transparent=" + this.f29115g + ", white=" + this.f29116h + ", black=" + this.i + ", dark90=" + this.f29117j + ", dark80=" + this.k + ", dark70=" + this.f29118l + ", dark60=" + this.f29119m + ", dark50=" + this.f29120n + ", dark40=" + this.o + ", dark30=" + this.f29121p + ", dark20=" + this.f29122q + ", dark10=" + this.f29123r + ", dark3=" + this.f29124s + ", light90=" + this.f29125t + ", light80=" + this.u + ", light70=" + this.v + ", light60=" + this.f29126w + ", light50=" + this.f29127x + ", light40=" + this.f29128y + ", light30=" + this.z + ", light20=" + this.A + ", light10=" + this.B + ", light3=" + this.C + ", neutral4=" + this.D + ", neutral5=" + this.E + ")";
        }

        public /* synthetic */ b(OrcaColors.OrcaColor orcaColor, OrcaColors.OrcaColor orcaColor2, OrcaColors.OrcaColor orcaColor3, OrcaColors.OrcaColor orcaColor4, OrcaColors.OrcaColor orcaColor5, OrcaColors.OrcaColor orcaColor6, OrcaColors.OrcaColor orcaColor7, OrcaColors.OrcaColor orcaColor8, OrcaColors.OrcaColor orcaColor9, OrcaColors.OrcaColor orcaColor10, OrcaColors.OrcaColor orcaColor11, OrcaColors.OrcaColor orcaColor12, OrcaColors.OrcaColor orcaColor13, OrcaColors.OrcaColor orcaColor14, OrcaColors.OrcaColor orcaColor15, OrcaColors.OrcaColor orcaColor16, OrcaColors.OrcaColor orcaColor17, OrcaColors.OrcaColor orcaColor18, OrcaColors.OrcaColor orcaColor19, OrcaColors.OrcaColor orcaColor20, OrcaColors.OrcaColor orcaColor21, OrcaColors.OrcaColor orcaColor22, OrcaColors.OrcaColor orcaColor23, OrcaColors.OrcaColor orcaColor24, OrcaColors.OrcaColor orcaColor25, OrcaColors.OrcaColor orcaColor26, OrcaColors.OrcaColor orcaColor27, OrcaColors.OrcaColor orcaColor28, OrcaColors.OrcaColor orcaColor29, OrcaColors.OrcaColor orcaColor30, OrcaColors.OrcaColor orcaColor31, int i, DefaultConstructorMarker defaultConstructorMarker) {
            OrcaColors.OrcaColor orcaColor32;
            OrcaColors.OrcaColor orcaColor33;
            OrcaColors.OrcaColor fromLong;
            OrcaColors.OrcaColor orcaColor34;
            OrcaColors.OrcaColor fromLong2;
            OrcaColors.OrcaColor orcaColor35;
            OrcaColors.OrcaColor fromLong3;
            OrcaColors.OrcaColor orcaColor36;
            OrcaColors.OrcaColor fromLong4;
            OrcaColors.OrcaColor orcaColor37;
            OrcaColors.OrcaColor orcaColor38;
            OrcaColors.OrcaColor fromLong5;
            OrcaColors.OrcaColor orcaColor39;
            OrcaColors.OrcaColor fromLong6;
            OrcaColors.OrcaColor orcaColor40;
            OrcaColors.OrcaColor orcaColor41;
            OrcaColors.OrcaColor fromLong7;
            OrcaColors.OrcaColor orcaColor42;
            OrcaColors.OrcaColor fromLong8;
            OrcaColors.OrcaColor orcaColor43;
            OrcaColors.OrcaColor orcaColor44;
            OrcaColors.OrcaColor fromLong9;
            OrcaColors.OrcaColor orcaColor45;
            OrcaColors.OrcaColor fromLong10;
            OrcaColors.OrcaColor orcaColor46;
            OrcaColors.OrcaColor orcaColor47;
            OrcaColors.OrcaColor fromLong11;
            OrcaColors.OrcaColor orcaColor48;
            OrcaColors.OrcaColor fromLong12;
            OrcaColors.OrcaColor fromLong13;
            OrcaColors.OrcaColor orcaColor49;
            OrcaColors.OrcaColor orcaColor50;
            OrcaColors.OrcaColor orcaColor51;
            OrcaColors.OrcaColor orcaColor52;
            OrcaColors.OrcaColor orcaColor53;
            OrcaColors.OrcaColor orcaColor54;
            OrcaColors.OrcaColor orcaColor55;
            OrcaColors.OrcaColor orcaColor56;
            OrcaColors.OrcaColor orcaColor57;
            OrcaColors.OrcaColor orcaColor58;
            OrcaColors.OrcaColor orcaColor59;
            OrcaColors.OrcaColor orcaColor60;
            OrcaColors.OrcaColor orcaColor61;
            OrcaColors.OrcaColor orcaColor62;
            OrcaColors.OrcaColor orcaColor63;
            OrcaColors.OrcaColor orcaColor64;
            OrcaColors.OrcaColor orcaColor65;
            OrcaColors.OrcaColor orcaColor66;
            OrcaColors.OrcaColor orcaColor67;
            OrcaColors.OrcaColor orcaColor68;
            OrcaColors.OrcaColor orcaColor69;
            OrcaColors.OrcaColor orcaColor70;
            OrcaColors.OrcaColor orcaColor71;
            OrcaColors.OrcaColor orcaColor72;
            OrcaColors.OrcaColor orcaColor73;
            OrcaColors.OrcaColor orcaColor74;
            OrcaColors.OrcaColor orcaColor75;
            OrcaColors.OrcaColor fromInt = (i & 1) != 0 ? new OrcaColors.OrcaColor.FromInt(57442) : orcaColor;
            OrcaColors.OrcaColor fromInt2 = (i & 2) != 0 ? new OrcaColors.OrcaColor.FromInt(14688288) : orcaColor2;
            OrcaColors.OrcaColor fromInt3 = (i & 4) != 0 ? new OrcaColors.OrcaColor.FromInt(16409600) : orcaColor3;
            OrcaColors.OrcaColor fromInt4 = (i & 8) != 0 ? new OrcaColors.OrcaColor.FromInt(16764672) : orcaColor4;
            OrcaColors.OrcaColor fromInt5 = (i & 16) != 0 ? new OrcaColors.OrcaColor.FromInt(15593213) : orcaColor5;
            OrcaColors.OrcaColor fromInt6 = (i & 32) != 0 ? new OrcaColors.OrcaColor.FromInt(15989247) : orcaColor6;
            OrcaColors.OrcaColor fromLong14 = (i & 64) != 0 ? new OrcaColors.OrcaColor.FromLong(0L) : orcaColor7;
            OrcaColors.OrcaColor fromInt7 = (i & 128) != 0 ? new OrcaColors.OrcaColor.FromInt(16777215) : orcaColor8;
            OrcaColors.OrcaColor fromInt8 = (i & 256) != 0 ? new OrcaColors.OrcaColor.FromInt(0) : orcaColor9;
            OrcaColors.OrcaColor fromLong15 = (i & 512) != 0 ? new OrcaColors.OrcaColor.FromLong(3858759680L) : orcaColor10;
            OrcaColors.OrcaColor fromLong16 = (i & 1024) != 0 ? new OrcaColors.OrcaColor.FromLong(3422552064L) : orcaColor11;
            OrcaColors.OrcaColor fromLong17 = (i & 2048) != 0 ? new OrcaColors.OrcaColor.FromLong(3003121664L) : orcaColor12;
            OrcaColors.OrcaColor fromLong18 = (i & 4096) != 0 ? new OrcaColors.OrcaColor.FromLong(2566914048L) : orcaColor13;
            if ((i & 8192) != 0) {
                orcaColor32 = fromInt;
                orcaColor33 = fromInt2;
                fromLong = new OrcaColors.OrcaColor.FromLong(2147483648L);
            } else {
                orcaColor32 = fromInt;
                orcaColor33 = fromInt2;
                fromLong = orcaColor14;
            }
            if ((i & 16384) != 0) {
                orcaColor34 = fromInt3;
                fromLong2 = new OrcaColors.OrcaColor.FromLong(1711276032L);
            } else {
                orcaColor34 = fromInt3;
                fromLong2 = orcaColor15;
            }
            if ((32768 & i) != 0) {
                orcaColor35 = fromLong2;
                fromLong3 = new OrcaColors.OrcaColor.FromLong(1291845632L);
            } else {
                orcaColor35 = fromLong2;
                fromLong3 = orcaColor16;
            }
            if ((i & 65536) != 0) {
                orcaColor36 = fromLong3;
                fromLong4 = new OrcaColors.OrcaColor.FromLong(855638016L);
            } else {
                orcaColor36 = fromLong3;
                fromLong4 = orcaColor17;
            }
            OrcaColors.OrcaColor fromLong19 = (i & 131072) != 0 ? new OrcaColors.OrcaColor.FromLong(436207616L) : orcaColor18;
            if ((i & 262144) != 0) {
                orcaColor37 = fromLong4;
                orcaColor38 = fromLong19;
                fromLong5 = new OrcaColors.OrcaColor.FromLong(134217728L);
            } else {
                orcaColor37 = fromLong4;
                orcaColor38 = fromLong19;
                fromLong5 = orcaColor19;
            }
            if ((i & 524288) != 0) {
                orcaColor39 = fromLong5;
                fromLong6 = new OrcaColors.OrcaColor.FromLong(3875536895L);
            } else {
                orcaColor39 = fromLong5;
                fromLong6 = orcaColor20;
            }
            OrcaColors.OrcaColor fromLong20 = (i & PKIFailureInfo.badCertTemplate) != 0 ? new OrcaColors.OrcaColor.FromLong(3439329279L) : orcaColor21;
            if ((i & PKIFailureInfo.badSenderNonce) != 0) {
                orcaColor40 = fromLong6;
                orcaColor41 = fromLong20;
                fromLong7 = new OrcaColors.OrcaColor.FromLong(3019898879L);
            } else {
                orcaColor40 = fromLong6;
                orcaColor41 = fromLong20;
                fromLong7 = orcaColor22;
            }
            if ((i & 4194304) != 0) {
                orcaColor42 = fromLong7;
                fromLong8 = new OrcaColors.OrcaColor.FromLong(2583691263L);
            } else {
                orcaColor42 = fromLong7;
                fromLong8 = orcaColor23;
            }
            OrcaColors.OrcaColor fromLong21 = (i & 8388608) != 0 ? new OrcaColors.OrcaColor.FromLong(2164260863L) : orcaColor24;
            if ((i & 16777216) != 0) {
                orcaColor43 = fromLong8;
                orcaColor44 = fromLong21;
                fromLong9 = new OrcaColors.OrcaColor.FromLong(1728053247L);
            } else {
                orcaColor43 = fromLong8;
                orcaColor44 = fromLong21;
                fromLong9 = orcaColor25;
            }
            if ((i & 33554432) != 0) {
                orcaColor45 = fromLong9;
                fromLong10 = new OrcaColors.OrcaColor.FromLong(1308622847L);
            } else {
                orcaColor45 = fromLong9;
                fromLong10 = orcaColor26;
            }
            OrcaColors.OrcaColor fromLong22 = (i & 67108864) != 0 ? new OrcaColors.OrcaColor.FromLong(872415231L) : orcaColor27;
            if ((i & 134217728) != 0) {
                orcaColor46 = fromLong10;
                orcaColor47 = fromLong22;
                fromLong11 = new OrcaColors.OrcaColor.FromLong(452984831L);
            } else {
                orcaColor46 = fromLong10;
                orcaColor47 = fromLong22;
                fromLong11 = orcaColor28;
            }
            if ((i & 268435456) != 0) {
                orcaColor48 = fromLong11;
                fromLong12 = new OrcaColors.OrcaColor.FromLong(150994943L);
            } else {
                orcaColor48 = fromLong11;
                fromLong12 = orcaColor29;
            }
            OrcaColors.OrcaColor fromLong23 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? new OrcaColors.OrcaColor.FromLong(4289967027L) : orcaColor30;
            if ((i & 1073741824) != 0) {
                orcaColor49 = fromLong12;
                orcaColor50 = fromLong23;
                fromLong13 = new OrcaColors.OrcaColor.FromLong(4292269782L);
                orcaColor53 = orcaColor39;
                orcaColor54 = orcaColor40;
                orcaColor55 = orcaColor41;
                orcaColor56 = orcaColor42;
                orcaColor57 = orcaColor43;
                orcaColor58 = orcaColor44;
                orcaColor59 = orcaColor45;
                orcaColor60 = orcaColor46;
                orcaColor61 = orcaColor47;
                orcaColor62 = orcaColor48;
                orcaColor65 = fromLong14;
                orcaColor66 = fromInt7;
                orcaColor67 = fromInt8;
                orcaColor68 = fromLong15;
                orcaColor69 = fromLong16;
                orcaColor70 = fromLong17;
                orcaColor71 = fromLong18;
                orcaColor72 = fromLong;
                orcaColor73 = orcaColor35;
                orcaColor74 = orcaColor36;
                orcaColor51 = orcaColor37;
                orcaColor52 = orcaColor38;
                orcaColor75 = fromInt4;
                orcaColor63 = fromInt5;
                orcaColor64 = fromInt6;
            } else {
                fromLong13 = orcaColor31;
                orcaColor49 = fromLong12;
                orcaColor50 = fromLong23;
                orcaColor51 = orcaColor37;
                orcaColor52 = orcaColor38;
                orcaColor53 = orcaColor39;
                orcaColor54 = orcaColor40;
                orcaColor55 = orcaColor41;
                orcaColor56 = orcaColor42;
                orcaColor57 = orcaColor43;
                orcaColor58 = orcaColor44;
                orcaColor59 = orcaColor45;
                orcaColor60 = orcaColor46;
                orcaColor61 = orcaColor47;
                orcaColor62 = orcaColor48;
                orcaColor63 = fromInt5;
                orcaColor64 = fromInt6;
                orcaColor65 = fromLong14;
                orcaColor66 = fromInt7;
                orcaColor67 = fromInt8;
                orcaColor68 = fromLong15;
                orcaColor69 = fromLong16;
                orcaColor70 = fromLong17;
                orcaColor71 = fromLong18;
                orcaColor72 = fromLong;
                orcaColor73 = orcaColor35;
                orcaColor74 = orcaColor36;
                orcaColor75 = fromInt4;
            }
            this(orcaColor32, orcaColor33, orcaColor34, orcaColor75, orcaColor63, orcaColor64, orcaColor65, orcaColor66, orcaColor67, orcaColor68, orcaColor69, orcaColor70, orcaColor71, orcaColor72, orcaColor73, orcaColor74, orcaColor51, orcaColor52, orcaColor53, orcaColor54, orcaColor55, orcaColor56, orcaColor57, orcaColor58, orcaColor59, orcaColor60, orcaColor61, orcaColor62, orcaColor49, orcaColor50, fromLong13);
        }
    }
}
