package qlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class l1 extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(SerialDescriptor primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f247676b = primitive.e() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f247676b;
    }
}
