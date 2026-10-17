package zim;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f322694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f322695c;

    public /* synthetic */ s(Object obj2, int i, int i2) {
        this.f322693a = i2;
        this.f322695c = obj2;
        this.f322694b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322693a) {
            case 0:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) this.f322695c;
                ValueParameterDescriptor valueParameterDescriptor = callableMemberDescriptor.getValueParameters().get(this.f322694b);
                Intrinsics.checkNotNullExpressionValue(valueParameterDescriptor, "get(...)");
                return valueParameterDescriptor;
            default:
                return (ParameterDescriptor) ((List) this.f322695c).get(this.f322694b);
        }
    }
}
