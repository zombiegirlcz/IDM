package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends edl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JvmMemberSignature.Method f322657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322658b;

    public l(JvmMemberSignature.Method signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f322657a = signature;
        this.f322658b = signature.asString();
    }

    @Override // edl.a
    public final String b() {
        return this.f322658b;
    }
}
