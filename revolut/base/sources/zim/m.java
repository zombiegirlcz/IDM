package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends edl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JvmMemberSignature.Method f322660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322661b;

    public m(JvmMemberSignature.Method signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f322660a = signature;
        this.f322661b = signature.asString();
    }

    @Override // edl.a
    public final String b() {
        return this.f322661b;
    }
}
