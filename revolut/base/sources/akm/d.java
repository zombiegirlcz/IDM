package akm;

import ht2.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6130b;

    public /* synthetic */ d(boolean z, int i) {
        this.f6129a = i;
        this.f6130b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f6129a) {
            case 0:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj2;
                int i = DescriptorUtilsKt.f187593a;
                Intrinsics.h(callableMemberDescriptor);
                return DescriptorUtilsKt.overriddenTreeAsSequence(callableMemberDescriptor, this.f6130b);
            default:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, null, null, false, null, this.f6130b, null, false, PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
    }
}
