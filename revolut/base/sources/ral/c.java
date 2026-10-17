package ral;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lral/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "description", "b", "inputHeader", "c", "inputHint", "d", "username", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inputHeader")
    @NotNull
    private final String inputHeader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("inputHint")
    @NotNull
    private final String inputHint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("username")
    @NotNull
    private final String username;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInputHeader() {
        return this.inputHeader;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInputHint() {
        return this.inputHint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.inputHeader, cVar.inputHeader) && Intrinsics.f(this.inputHint, cVar.inputHint) && Intrinsics.f(this.username, cVar.username);
    }

    public final int hashCode() {
        return this.username.hashCode() + p.a.c(p.a.c(this.description.hashCode() * 31, 31, this.inputHeader), 31, this.inputHint);
    }
}
