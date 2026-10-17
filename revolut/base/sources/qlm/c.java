package qlm;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f247621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.f247621b = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        switch (this.f247621b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
