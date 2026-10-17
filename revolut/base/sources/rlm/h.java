package rlm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f255104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f255105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f255106c;
    public final boolean d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f255107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f255108h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f255109j;

    public h() {
        this(0);
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f255104a + ", ignoreUnknownKeys=" + this.f255105b + ", isLenient=" + this.f255106c + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.d + ", prettyPrintIndent='" + this.e + "', coerceInputValues=" + this.f + ", useArrayPolymorphism=false, classDiscriminator='" + this.f255107g + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f255108h + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.i + ", allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f255109j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public h(boolean z, boolean z3, boolean z4, boolean z6, String prettyPrintIndent, boolean z11, String classDiscriminator, boolean z12, boolean z29, a classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f255104a = z;
        this.f255105b = z3;
        this.f255106c = z4;
        this.d = z6;
        this.e = prettyPrintIndent;
        this.f = z11;
        this.f255107g = classDiscriminator;
        this.f255108h = z12;
        this.i = z29;
        this.f255109j = classDiscriminatorMode;
    }

    public /* synthetic */ h(int i) {
        this(false, false, false, true, "    ", false, "type", true, false, a.POLYMORPHIC);
    }
}
