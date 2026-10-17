package iy1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor f169597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169598c;
    public final ApmContact.SimpleState d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f169599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f169600h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f169601j;

    public f(String str, ApmDescriptor descriptor, String str2, ApmContact.SimpleState state, String str3, String str4, String str5, String str6, String str7, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f169596a = str;
        this.f169597b = descriptor;
        this.f169598c = str2;
        this.d = state;
        this.e = str3;
        this.f = str4;
        this.f169599g = str5;
        this.f169600h = str6;
        this.i = str7;
        this.f169601j = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f169596a, fVar.f169596a) && Intrinsics.f(this.f169597b, fVar.f169597b) && Intrinsics.f(this.f169598c, fVar.f169598c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f169599g, fVar.f169599g) && Intrinsics.f(this.f169600h, fVar.f169600h) && Intrinsics.f(this.i, fVar.i) && this.f169601j == fVar.f169601j;
    }

    public final int hashCode() {
        String str = this.f169596a;
        int iHashCode = (this.f169597b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f169598c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f169599g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f169600h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        return Boolean.hashCode(this.f169601j) + ((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }
}
