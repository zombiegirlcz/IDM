package ekm;

import a26.s;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f127195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoizedFunctionToNullable f127196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f127197c;
    public final /* synthetic */ DeserializedClassDescriptor d;

    public e(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.d = deserializedClassDescriptor;
        List<ProtoBuf.EnumEntry> enumEntryList = deserializedClassDescriptor.getClassProto().getEnumEntryList();
        Intrinsics.checkNotNullExpressionValue(enumEntryList, "getEnumEntryList(...)");
        List<ProtoBuf.EnumEntry> list = enumEntryList;
        int iB = q0.b(w.t(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : list) {
            linkedHashMap.put(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.EnumEntry) obj2).getName()), obj2);
        }
        this.f127195a = linkedHashMap;
        this.f127196b = this.d.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new s(this, this.d, 14));
        this.f127197c = this.d.getC().getStorageManager().createLazyValue(new ajm.d(this, 10));
    }
}
