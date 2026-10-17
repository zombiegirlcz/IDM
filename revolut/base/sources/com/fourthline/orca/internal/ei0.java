package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes23.dex */
public final class ei0 implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28149b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28150c = 8;
    private static aj0 d = aj0.d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f28151a = com.bumptech.glide.c.d("OrcaPaletteColor", new SerialDescriptor[0], new bi1(20));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(aj0 aj0Var) {
            Intrinsics.checkNotNullParameter(aj0Var, "<set-?>");
            ei0.d = aj0Var;
        }

        private a() {
        }
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f28151a;
    }

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public di0 deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Color.Companion companion = Color.INSTANCE;
        long jM1993getTransparent0d7_KjU = companion.m1993getTransparent0d7_KjU();
        long jM1993getTransparent0d7_KjU2 = companion.m1993getTransparent0d7_KjU();
        SerialDescriptor descriptor = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor);
        long jA = jM1993getTransparent0d7_KjU;
        long jA2 = jM1993getTransparent0d7_KjU2;
        while (true) {
            int iD = dVarBeginStructure.d(getDescriptor());
            if (iD == -1) {
                Unit unit = Unit.f186387a;
                dVarBeginStructure.endStructure(descriptor);
                return f81.a(new di0(jA, jA2, null), d);
            }
            if (iD == 0) {
                jA = fi0.a(dVarBeginStructure.decodeStringElement(getDescriptor(), 0));
            } else {
                if (iD != 1) {
                    throw new IllegalStateException(("Unexpected index: " + iD).toString());
                }
                jA2 = fi0.a(dVarBeginStructure.decodeStringElement(getDescriptor(), 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(olm.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        zhm.f0 f0Var = zhm.f0.f322471a;
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.n1 n1Var = qlm.v1.f247719b;
        buildClassSerialDescriptor.a("light", n1Var, f0Var, false);
        buildClassSerialDescriptor.a("dark", n1Var, f0Var, false);
        return Unit.f186387a;
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, di0 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
