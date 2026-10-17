package zim;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes14.dex */
public final class w implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f322715b = new w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f322716c = new w(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322717a;

    public /* synthetic */ w(int i) {
        this.f322717a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        MemberDeserializer deserializeToDescriptor = (MemberDeserializer) obj2;
        ProtoBuf.Property proto = (ProtoBuf.Property) obj3;
        switch (this.f322717a) {
            case 0:
                x xVar = e0.Companion;
                Intrinsics.checkNotNullParameter(deserializeToDescriptor, "$this$deserializeToDescriptor");
                Intrinsics.checkNotNullParameter(proto, "proto");
                break;
            default:
                int i = a1.d;
                Intrinsics.checkNotNullParameter(deserializeToDescriptor, "$this$deserializeToDescriptor");
                Intrinsics.checkNotNullParameter(proto, "proto");
                break;
        }
        return deserializeToDescriptor.loadProperty(proto, true);
    }
}
