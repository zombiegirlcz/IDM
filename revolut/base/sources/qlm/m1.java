package qlm;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class m1 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f247678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f247678b = new l1(primitiveSerializer.getDescriptor());
    }

    @Override // qlm.a
    public final Object a() {
        return (k1) g(j());
    }

    @Override // qlm.a
    public final int b(Object obj2) {
        k1 k1Var = (k1) obj2;
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        return k1Var.d();
    }

    @Override // qlm.a
    public final Iterator c(Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // qlm.a, mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return e(decoder);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f247678b;
    }

    @Override // qlm.a
    public final Object h(Object obj2) {
        k1 k1Var = (k1) obj2;
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        return k1Var.a();
    }

    @Override // qlm.t
    public final void i(int i, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((k1) obj2, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(CompositeEncoder compositeEncoder, Object obj2, int i);

    @Override // qlm.t, mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iD = d(obj2);
        l1 l1Var = this.f247678b;
        CompositeEncoder compositeEncoderC = encoder.c(l1Var);
        k(compositeEncoderC, obj2, iD);
        compositeEncoderC.endStructure(l1Var);
    }
}
