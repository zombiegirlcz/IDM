package kem;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.vision.internal.mh;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@mlm.g(with = s0.class)
public final class q0 implements Serializable {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f183227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183228c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f183229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0 f183230h;
    public final n0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f183231j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f183232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f183233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f183234n;
    public final Lazy o;

    public q0(n0 n0Var, String host, int i, ArrayList pathSegments, f0 parameters, String fragment, String str, String str2, boolean z, String urlString) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.f183226a = host;
        this.f183227b = i;
        this.f183228c = str;
        this.d = str2;
        this.e = z;
        this.f = urlString;
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i).toString());
        }
        this.f183229g = yhm.j.b(new com.fourthline.core.internal.k0(pathSegments, 6));
        this.f183230h = n0Var;
        if (n0Var == null) {
            n0.Companion.getClass();
            n0Var = n0.f183216c;
        }
        this.i = n0Var;
        this.f183231j = yhm.j.b(new mh(pathSegments, this, 2));
        final int i2 = 0;
        this.k = yhm.j.b(new Function0(this) { // from class: kem.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f183222b;

            {
                this.f183222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                q0 q0Var = this.f183222b;
                switch (i3) {
                    case 0:
                        String str3 = q0Var.f;
                        int iS = kotlin.text.d0.S(str3, '?', 0, 6) + 1;
                        if (iS == 0) {
                            return "";
                        }
                        int iS2 = kotlin.text.d0.S(str3, '#', iS, 4);
                        if (iS2 == -1) {
                            String strSubstring = str3.substring(iS);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str3.substring(iS, iS2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        String str4 = q0Var.f;
                        int iS3 = kotlin.text.d0.S(str4, '/', q0Var.i.f183217a.length() + 3, 4);
                        if (iS3 == -1) {
                            return "";
                        }
                        int iS4 = kotlin.text.d0.S(str4, '#', iS3, 4);
                        if (iS4 == -1) {
                            String strSubstring3 = str4.substring(iS3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str4.substring(iS3, iS4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str5 = q0Var.f;
                        String str6 = q0Var.f183228c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = q0Var.i.f183217a.length() + 3;
                        String strSubstring5 = str5.substring(length, kotlin.text.d0.U(str5, new char[]{CoreConstants.COLON_CHAR, '@'}, length, false));
                        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str7 = q0Var.f;
                        String str8 = q0Var.d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        String strSubstring6 = str7.substring(kotlin.text.d0.S(str7, CoreConstants.COLON_CHAR, q0Var.i.f183217a.length() + 3, 4) + 1, kotlin.text.d0.S(str7, '@', 0, 6));
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        String str9 = q0Var.f;
                        int iS5 = kotlin.text.d0.S(str9, '#', 0, 6) + 1;
                        if (iS5 == 0) {
                            return "";
                        }
                        String strSubstring7 = str9.substring(iS5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i3 = 1;
        this.f183232l = yhm.j.b(new Function0(this) { // from class: kem.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f183222b;

            {
                this.f183222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                q0 q0Var = this.f183222b;
                switch (i32) {
                    case 0:
                        String str3 = q0Var.f;
                        int iS = kotlin.text.d0.S(str3, '?', 0, 6) + 1;
                        if (iS == 0) {
                            return "";
                        }
                        int iS2 = kotlin.text.d0.S(str3, '#', iS, 4);
                        if (iS2 == -1) {
                            String strSubstring = str3.substring(iS);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str3.substring(iS, iS2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        String str4 = q0Var.f;
                        int iS3 = kotlin.text.d0.S(str4, '/', q0Var.i.f183217a.length() + 3, 4);
                        if (iS3 == -1) {
                            return "";
                        }
                        int iS4 = kotlin.text.d0.S(str4, '#', iS3, 4);
                        if (iS4 == -1) {
                            String strSubstring3 = str4.substring(iS3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str4.substring(iS3, iS4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str5 = q0Var.f;
                        String str6 = q0Var.f183228c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = q0Var.i.f183217a.length() + 3;
                        String strSubstring5 = str5.substring(length, kotlin.text.d0.U(str5, new char[]{CoreConstants.COLON_CHAR, '@'}, length, false));
                        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str7 = q0Var.f;
                        String str8 = q0Var.d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        String strSubstring6 = str7.substring(kotlin.text.d0.S(str7, CoreConstants.COLON_CHAR, q0Var.i.f183217a.length() + 3, 4) + 1, kotlin.text.d0.S(str7, '@', 0, 6));
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        String str9 = q0Var.f;
                        int iS5 = kotlin.text.d0.S(str9, '#', 0, 6) + 1;
                        if (iS5 == 0) {
                            return "";
                        }
                        String strSubstring7 = str9.substring(iS5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i5 = 2;
        this.f183233m = yhm.j.b(new Function0(this) { // from class: kem.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f183222b;

            {
                this.f183222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                q0 q0Var = this.f183222b;
                switch (i32) {
                    case 0:
                        String str3 = q0Var.f;
                        int iS = kotlin.text.d0.S(str3, '?', 0, 6) + 1;
                        if (iS == 0) {
                            return "";
                        }
                        int iS2 = kotlin.text.d0.S(str3, '#', iS, 4);
                        if (iS2 == -1) {
                            String strSubstring = str3.substring(iS);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str3.substring(iS, iS2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        String str4 = q0Var.f;
                        int iS3 = kotlin.text.d0.S(str4, '/', q0Var.i.f183217a.length() + 3, 4);
                        if (iS3 == -1) {
                            return "";
                        }
                        int iS4 = kotlin.text.d0.S(str4, '#', iS3, 4);
                        if (iS4 == -1) {
                            String strSubstring3 = str4.substring(iS3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str4.substring(iS3, iS4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str5 = q0Var.f;
                        String str6 = q0Var.f183228c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = q0Var.i.f183217a.length() + 3;
                        String strSubstring5 = str5.substring(length, kotlin.text.d0.U(str5, new char[]{CoreConstants.COLON_CHAR, '@'}, length, false));
                        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str7 = q0Var.f;
                        String str8 = q0Var.d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        String strSubstring6 = str7.substring(kotlin.text.d0.S(str7, CoreConstants.COLON_CHAR, q0Var.i.f183217a.length() + 3, 4) + 1, kotlin.text.d0.S(str7, '@', 0, 6));
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        String str9 = q0Var.f;
                        int iS5 = kotlin.text.d0.S(str9, '#', 0, 6) + 1;
                        if (iS5 == 0) {
                            return "";
                        }
                        String strSubstring7 = str9.substring(iS5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i6 = 3;
        this.f183234n = yhm.j.b(new Function0(this) { // from class: kem.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f183222b;

            {
                this.f183222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                q0 q0Var = this.f183222b;
                switch (i32) {
                    case 0:
                        String str3 = q0Var.f;
                        int iS = kotlin.text.d0.S(str3, '?', 0, 6) + 1;
                        if (iS == 0) {
                            return "";
                        }
                        int iS2 = kotlin.text.d0.S(str3, '#', iS, 4);
                        if (iS2 == -1) {
                            String strSubstring = str3.substring(iS);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str3.substring(iS, iS2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        String str4 = q0Var.f;
                        int iS3 = kotlin.text.d0.S(str4, '/', q0Var.i.f183217a.length() + 3, 4);
                        if (iS3 == -1) {
                            return "";
                        }
                        int iS4 = kotlin.text.d0.S(str4, '#', iS3, 4);
                        if (iS4 == -1) {
                            String strSubstring3 = str4.substring(iS3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str4.substring(iS3, iS4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str5 = q0Var.f;
                        String str6 = q0Var.f183228c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = q0Var.i.f183217a.length() + 3;
                        String strSubstring5 = str5.substring(length, kotlin.text.d0.U(str5, new char[]{CoreConstants.COLON_CHAR, '@'}, length, false));
                        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str7 = q0Var.f;
                        String str8 = q0Var.d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        String strSubstring6 = str7.substring(kotlin.text.d0.S(str7, CoreConstants.COLON_CHAR, q0Var.i.f183217a.length() + 3, 4) + 1, kotlin.text.d0.S(str7, '@', 0, 6));
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        String str9 = q0Var.f;
                        int iS5 = kotlin.text.d0.S(str9, '#', 0, 6) + 1;
                        if (iS5 == 0) {
                            return "";
                        }
                        String strSubstring7 = str9.substring(iS5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
        final int i21 = 4;
        this.o = yhm.j.b(new Function0(this) { // from class: kem.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f183222b;

            {
                this.f183222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i21;
                q0 q0Var = this.f183222b;
                switch (i32) {
                    case 0:
                        String str3 = q0Var.f;
                        int iS = kotlin.text.d0.S(str3, '?', 0, 6) + 1;
                        if (iS == 0) {
                            return "";
                        }
                        int iS2 = kotlin.text.d0.S(str3, '#', iS, 4);
                        if (iS2 == -1) {
                            String strSubstring = str3.substring(iS);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            return strSubstring;
                        }
                        String strSubstring2 = str3.substring(iS, iS2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        return strSubstring2;
                    case 1:
                        String str4 = q0Var.f;
                        int iS3 = kotlin.text.d0.S(str4, '/', q0Var.i.f183217a.length() + 3, 4);
                        if (iS3 == -1) {
                            return "";
                        }
                        int iS4 = kotlin.text.d0.S(str4, '#', iS3, 4);
                        if (iS4 == -1) {
                            String strSubstring3 = str4.substring(iS3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            return strSubstring3;
                        }
                        String strSubstring4 = str4.substring(iS3, iS4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                        return strSubstring4;
                    case 2:
                        String str5 = q0Var.f;
                        String str6 = q0Var.f183228c;
                        if (str6 == null) {
                            return null;
                        }
                        if (str6.length() == 0) {
                            return "";
                        }
                        int length = q0Var.i.f183217a.length() + 3;
                        String strSubstring5 = str5.substring(length, kotlin.text.d0.U(str5, new char[]{CoreConstants.COLON_CHAR, '@'}, length, false));
                        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                        return strSubstring5;
                    case 3:
                        String str7 = q0Var.f;
                        String str8 = q0Var.d;
                        if (str8 == null) {
                            return null;
                        }
                        if (str8.length() == 0) {
                            return "";
                        }
                        String strSubstring6 = str7.substring(kotlin.text.d0.S(str7, CoreConstants.COLON_CHAR, q0Var.i.f183217a.length() + 3, 4) + 1, kotlin.text.d0.S(str7, '@', 0, 6));
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        return strSubstring6;
                    default:
                        String str9 = q0Var.f;
                        int iS5 = kotlin.text.d0.S(str9, '#', 0, 6) + 1;
                        if (iS5 == 0) {
                            return "";
                        }
                        String strSubstring7 = str9.substring(iS5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        return strSubstring7;
                }
            }
        });
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || q0.class != obj2.getClass()) {
            return false;
        }
        return Intrinsics.f(this.f, ((q0) obj2).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.f;
    }
}
