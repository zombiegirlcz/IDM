package jkl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Ljkl/h0;", "Ljkl/i0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getChallengeId", "challengeId", "b", "getId", "id", "c", "getAttestationObject", "attestationObject", "d", "getClientDataJson", "clientDataJson", "", "e", "Ljava/lang/Object;", "getClientExtension", "()Ljava/lang/Object;", "clientExtension", "Ljkl/b0;", "f", "Ljkl/b0;", "getName", "()Ljkl/b0;", "name", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("challengeId")
    @NotNull
    private final String challengeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("attestationObject")
    @NotNull
    private final String attestationObject;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("clientDataJson")
    @NotNull
    private final String clientDataJson;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("clientExtension")
    @NotNull
    private final Object clientExtension;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final b0 name;

    public h0(String challengeId, String id10, String attestationObject, String clientDataJson) {
        Unit clientExtension = Unit.f186387a;
        b0 name = b0.WEBAUTHN;
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
        Intrinsics.checkNotNullParameter(clientDataJson, "clientDataJson");
        Intrinsics.checkNotNullParameter(clientExtension, "clientExtension");
        Intrinsics.checkNotNullParameter(name, "name");
        this.challengeId = challengeId;
        this.id = id10;
        this.attestationObject = attestationObject;
        this.clientDataJson = clientDataJson;
        this.clientExtension = clientExtension;
        this.name = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.challengeId, h0Var.challengeId) && Intrinsics.f(this.id, h0Var.id) && Intrinsics.f(this.attestationObject, h0Var.attestationObject) && Intrinsics.f(this.clientDataJson, h0Var.clientDataJson) && Intrinsics.f(this.clientExtension, h0Var.clientExtension) && this.name == h0Var.name;
    }

    @Override // jkl.i0
    public final b0 getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.name.hashCode() + p.a.b(p.a.c(p.a.c(p.a.c(this.challengeId.hashCode() * 31, 31, this.id), 31, this.attestationObject), 31, this.clientDataJson), 31, this.clientExtension);
    }
}
