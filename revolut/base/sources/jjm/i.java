package jjm;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtoBuf.VersionRequirement.Builder f175019b;

    public /* synthetic */ i(ProtoBuf.VersionRequirement.Builder builder, int i) {
        this.f175018a = i;
        this.f175019b = builder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f175018a;
        int iIntValue = ((Number) obj2).intValue();
        switch (i) {
            case 0:
                ProtoBuf.VersionRequirement.Builder builder = this.f175019b;
                Intrinsics.h(builder);
                builder.setVersion(iIntValue);
                break;
            default:
                ProtoBuf.VersionRequirement.Builder builder2 = this.f175019b;
                Intrinsics.h(builder2);
                builder2.setVersionFull(iIntValue);
                break;
        }
        return Unit.f186387a;
    }
}
