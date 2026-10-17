package qlm;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class w0 extends p0 {
    public final /* synthetic */ int d;
    public final olm.g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(final KSerializer keySerializer, final KSerializer valueSerializer, int i) {
        super(keySerializer, valueSerializer);
        this.d = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                super(keySerializer, valueSerializer);
                final int i2 = 1;
                this.e = com.bumptech.glide.c.d("kotlin.Pair", new SerialDescriptor[0], new Function1() { // from class: qlm.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        olm.a buildSerialDescriptor = (olm.a) obj2;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                SerialDescriptor descriptor = keySerializer.getDescriptor();
                                zhm.f0 f0Var = zhm.f0.f322471a;
                                buildSerialDescriptor.a("key", descriptor, f0Var, false);
                                buildSerialDescriptor.a("value", valueSerializer.getDescriptor(), f0Var, false);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                SerialDescriptor descriptor2 = keySerializer.getDescriptor();
                                zhm.f0 f0Var2 = zhm.f0.f322471a;
                                buildSerialDescriptor.a("first", descriptor2, f0Var2, false);
                                buildSerialDescriptor.a("second", valueSerializer.getDescriptor(), f0Var2, false);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                break;
            default:
                Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                final int i3 = 0;
                this.e = com.bumptech.glide.c.e("kotlin.collections.Map.Entry", olm.k.d, new SerialDescriptor[0], new Function1() { // from class: qlm.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        olm.a buildSerialDescriptor = (olm.a) obj2;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                SerialDescriptor descriptor = keySerializer.getDescriptor();
                                zhm.f0 f0Var = zhm.f0.f322471a;
                                buildSerialDescriptor.a("key", descriptor, f0Var, false);
                                buildSerialDescriptor.a("value", valueSerializer.getDescriptor(), f0Var, false);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                SerialDescriptor descriptor2 = keySerializer.getDescriptor();
                                zhm.f0 f0Var2 = zhm.f0.f322471a;
                                buildSerialDescriptor.a("first", descriptor2, f0Var2, false);
                                buildSerialDescriptor.a("second", valueSerializer.getDescriptor(), f0Var2, false);
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                break;
        }
    }

    @Override // qlm.p0
    public final Object a(Object obj2) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry, "<this>");
                return entry.getKey();
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<this>");
                return pair.f186385a;
        }
    }

    @Override // qlm.p0
    public final Object b(Object obj2) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry, "<this>");
                return entry.getValue();
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<this>");
                return pair.f186386b;
        }
    }

    @Override // qlm.p0
    public final Object d(Object obj2, Object obj3) {
        switch (this.d) {
            case 0:
                return new v0(obj2, obj3);
            default:
                return new Pair(obj2, obj3);
        }
    }

    @Override // qlm.p0, mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        switch (this.d) {
        }
        return this.e;
    }
}
