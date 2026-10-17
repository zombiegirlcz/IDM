package pv9;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv9.d f240027b;

    public /* synthetic */ h(kv9.d dVar, int i) {
        this.f240026a = i;
        this.f240027b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240026a) {
            case 0:
                String symmetricEncrypted = (String) obj2;
                Intrinsics.checkNotNullParameter(symmetricEncrypted, "symmetricEncrypted");
                return new kv9.e(this.f240027b.getCode(), symmetricEncrypted);
            default:
                od0.i symmetricForRecipientDecrypted = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(symmetricForRecipientDecrypted, "symmetricForRecipientDecrypted");
                return new Pair(this.f240027b, symmetricForRecipientDecrypted);
        }
    }
}
