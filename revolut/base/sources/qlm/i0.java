package qlm;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class i0 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f247658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f247659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(KSerializer eSerializer, int i) {
        super(eSerializer);
        this.f247658b = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc = eSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
                this.f247659c = new c(elementDesc, 2);
                break;
            default:
                Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
                SerialDescriptor elementDesc2 = eSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(elementDesc2, "elementDesc");
                this.f247659c = new c(elementDesc2, 1);
                break;
        }
    }

    @Override // qlm.a
    public final Object a() {
        switch (this.f247658b) {
            case 0:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // qlm.a
    public final int b(Object obj2) {
        switch (this.f247658b) {
            case 0:
                HashSet hashSet = (HashSet) obj2;
                Intrinsics.checkNotNullParameter(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        switch (this.f247658b) {
            case 0:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new HashSet((Collection) null);
            default:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        switch (this.f247658b) {
        }
        return (c) this.f247659c;
    }

    @Override // qlm.a
    public final Object h(Object obj2) {
        switch (this.f247658b) {
            case 0:
                HashSet hashSet = (HashSet) obj2;
                Intrinsics.checkNotNullParameter(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // qlm.t
    public final void i(int i, Object obj2, Object obj3) {
        switch (this.f247658b) {
            case 0:
                HashSet hashSet = (HashSet) obj2;
                Intrinsics.checkNotNullParameter(hashSet, "<this>");
                hashSet.add(obj3);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                linkedHashSet.add(obj3);
                break;
        }
    }
}
