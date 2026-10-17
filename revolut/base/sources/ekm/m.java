package ekm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import zhm.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f127215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeserializedMemberScope f127216c;

    public /* synthetic */ m(n nVar, DeserializedMemberScope deserializedMemberScope, int i) {
        this.f127214a = i;
        this.f127215b = nVar;
        this.f127216c = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f127214a) {
            case 0:
                return a1.l(this.f127215b.f127218a.keySet(), this.f127216c.g());
            default:
                return a1.l(this.f127215b.f127219b.keySet(), this.f127216c.h());
        }
    }
}
