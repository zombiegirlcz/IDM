package b25;

import kotlin.Metadata;
import lg.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u0014"}, d2 = {"Lb25/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "d", "()Z", "push", "b", "email", "c", "e", "sms", "phone", "f", "whatsapp", "ivr", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("push")
    private final boolean push;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("email")
    private final boolean email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("sms")
    private final boolean sms;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("phone")
    private final boolean phone;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("whatsapp")
    private final boolean whatsapp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("ivr")
    private final boolean ivr;

    public a(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.push = z;
        this.email = z3;
        this.sms = z4;
        this.phone = z6;
        this.whatsapp = z11;
        this.ivr = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIvr() {
        return this.ivr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getPush() {
        return this.push;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSms() {
        return this.sms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.push == aVar.push && this.email == aVar.email && this.sms == aVar.sms && this.phone == aVar.phone && this.whatsapp == aVar.whatsapp && this.ivr == aVar.ivr;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getWhatsapp() {
        return this.whatsapp;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.ivr) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.push) * 31, 31, this.email), 31, this.sms), 31, this.phone), 31, this.whatsapp);
    }
}
