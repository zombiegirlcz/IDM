package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a81;
import com.fourthline.orca.internal.i8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0005&+,\u0015\"B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/fourthline/orca/internal/p41;", "", "Lcom/fourthline/orca/internal/p41$c;", "default", "Lcom/fourthline/orca/internal/p41$d;", "disabled", "Lcom/fourthline/orca/internal/p41$e;", "selected", "<init>", "(Lcom/fourthline/orca/internal/p41$c;Lcom/fourthline/orca/internal/p41$d;Lcom/fourthline/orca/internal/p41$e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/p41$c;Lcom/fourthline/orca/internal/p41$d;Lcom/fourthline/orca/internal/p41$e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/p41;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/p41$c;", "()Lcom/fourthline/orca/internal/p41$c;", "b", "Lcom/fourthline/orca/internal/p41$d;", "getDisabled", "()Lcom/fourthline/orca/internal/p41$d;", "c", "Lcom/fourthline/orca/internal/p41$e;", "getSelected", "()Lcom/fourthline/orca/internal/p41$e;", "Companion", "e", "d", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class p41 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d disabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e selected;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31828b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f31827a = aVar;
            f31828b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement", aVar, 3);
            pluginGeneratedSerialDescriptor.j("default", false);
            pluginGeneratedSerialDescriptor.j("disabled", false);
            pluginGeneratedSerialDescriptor.j("selected", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p41 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            c cVar = null;
            d dVar = null;
            e eVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c.a.f31835a, cVar);
                    i |= 1;
                } else if (iD == 1) {
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, d.a.f31843a, dVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e.a.f31847a, eVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new p41(i, cVar, dVar, eVar, (SerializationConstructorMarker) null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{c.a.f31835a, d.a.f31843a, e.a.f31847a};
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // qlm.f0
        public /* bridge */ KSerializer[] typeParametersSerializers() {
            return qlm.j1.f247666a;
        }

        @Override // mlm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, p41 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            p41.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p41$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f31827a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u00035#1B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012(\u0010\u0011\u001a$0\fj\u0011`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B{\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b?\u0010<R9\u0010\u0011\u001a$0\fj\u0011`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010)R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\b@\u00100R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b>\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/fourthline/orca/internal/p41$c;", "", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/r21;", "shadow", "Lcom/fourthline/orca/internal/p41$c$c;", "toggle", "Lcom/fourthline/orca/internal/a81;", "text", "subtitle", "subline", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "icon", "", "opacity", "Lcom/fourthline/orca/internal/i8;", "border", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/r21;Lcom/fourthline/orca/internal/p41$c$c;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;ILcom/fourthline/orca/internal/ea;FLcom/fourthline/orca/internal/i8;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/r21;Lcom/fourthline/orca/internal/p41$c$c;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;ILcom/fourthline/orca/internal/ea;FLcom/fourthline/orca/internal/i8;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/p41$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "f", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/r21;", "getShadow", "()Lcom/fourthline/orca/internal/r21;", "c", "Lcom/fourthline/orca/internal/p41$c$c;", "getToggle", "()Lcom/fourthline/orca/internal/p41$c$c;", "d", "Lcom/fourthline/orca/internal/a81;", "j", "()Lcom/fourthline/orca/internal/a81;", "e", "i", "getSubline", "g", "I", "h", "F", "getOpacity", "()F", "Lcom/fourthline/orca/internal/i8;", "getBorder", "()Lcom/fourthline/orca/internal/i8;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] k;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final r21 shadow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C0260c toggle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final a81 text;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final a81 subtitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final a81 subline;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final int radius;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final ea icon;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final float opacity;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final i8 border;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31836b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f31835a = aVar;
                f31836b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement.RadioCellElement", aVar, 10);
                pluginGeneratedSerialDescriptor.j("background", false);
                pluginGeneratedSerialDescriptor.j("shadow", false);
                pluginGeneratedSerialDescriptor.j("toggle", false);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("subtitle", false);
                pluginGeneratedSerialDescriptor.j("subline", false);
                pluginGeneratedSerialDescriptor.j("radius", false);
                pluginGeneratedSerialDescriptor.j("icon", false);
                pluginGeneratedSerialDescriptor.j("opacity", false);
                pluginGeneratedSerialDescriptor.j("border", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = c.k;
                dVarBeginStructure.getClass();
                ea eaVar = null;
                ea eaVar2 = null;
                r21 r21Var = null;
                C0260c c0260c = null;
                a81 a81Var = null;
                a81 a81Var2 = null;
                a81 a81Var3 = null;
                float fDecodeFloatElement = 0.0f;
                boolean z = true;
                int i = 0;
                int iIntValue = 0;
                i8 i8Var = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            eaVar2 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar2);
                            i |= 1;
                            break;
                        case 1:
                            r21Var = (r21) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), r21Var);
                            i |= 2;
                            break;
                        case 2:
                            c0260c = (C0260c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, C0260c.a.f31840a, c0260c);
                            i |= 4;
                            break;
                        case 3:
                            a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a81.a.f26728a, a81Var);
                            i |= 8;
                            break;
                        case 4:
                            a81Var2 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a81.a.f26728a, a81Var2);
                            i |= 16;
                            break;
                        case 5:
                            a81Var3 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, a81.a.f26728a, a81Var3);
                            i |= 32;
                            break;
                        case 6:
                            iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), Integer.valueOf(iIntValue))).intValue();
                            i |= 64;
                            break;
                        case 7:
                            eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), eaVar);
                            i |= 128;
                            break;
                        case 8:
                            fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 8);
                            i |= 256;
                            break;
                        case 9:
                            i8Var = (i8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, i8.a.f29525a, i8Var);
                            i |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, eaVar2, r21Var, c0260c, a81Var, a81Var2, a81Var3, iIntValue, eaVar, fDecodeFloatElement, i8Var, (SerializationConstructorMarker) null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = c.k;
                a81.a aVar = a81.a.f26728a;
                return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), C0260c.a.f31840a, aVar, aVar, aVar, lazyArr[6].getValue(), lazyArr[7].getValue(), qlm.e0.f247634a, i8.a.f29525a};
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // qlm.f0
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return qlm.j1.f247666a;
            }

            @Override // mlm.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, c value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                c.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.p41$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f31835a;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.p41$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/p41$c$c;", "", "Lcom/fourthline/orca/internal/ea;", "highlight", "background", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/p41$c$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "getHighlight", "()Lcom/fourthline/orca/internal/ea;", "b", "getBackground", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class C0260c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final Lazy[] f31837c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final ea highlight;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final ea background;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.p41$c$c$a */
            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f31840a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f31841b;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f31840a = aVar;
                    f31841b = 8;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement.RadioCellElement.ToggleElement", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("highlight", false);
                    pluginGeneratedSerialDescriptor.j("background", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // mlm.b
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0260c deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    Lazy[] lazyArr = C0260c.f31837c;
                    dVarBeginStructure.getClass();
                    SerializationConstructorMarker serializationConstructorMarker = null;
                    boolean z = true;
                    int i = 0;
                    ea eaVar = null;
                    ea eaVar2 = null;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                            i |= 1;
                        } else {
                            if (iD != 1) {
                                throw new UnknownFieldException(iD);
                            }
                            eaVar2 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), eaVar2);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new C0260c(i, eaVar, eaVar2, serializationConstructorMarker);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    Lazy[] lazyArr = C0260c.f31837c;
                    return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // qlm.f0
                public /* bridge */ KSerializer[] typeParametersSerializers() {
                    return qlm.j1.f247666a;
                }

                @Override // mlm.h
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void serialize(Encoder encoder, C0260c value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    C0260c.a(value, compositeEncoderBeginStructure, serialDescriptor);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.p41$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f31840a;
                }

                private Companion() {
                }
            }

            static {
                yhm.k kVar = yhm.k.PUBLICATION;
                f31837c = new Lazy[]{yhm.j.c(kVar, new wp1(19)), yhm.j.c(kVar, new wp1(20))};
            }

            public /* synthetic */ C0260c(int i, ea eaVar, ea eaVar2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    qlm.j1.f(a.f31840a.getDescriptor(), i, 3);
                    throw null;
                }
                this.highlight = eaVar;
                this.background = eaVar2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer a() {
                return ea.INSTANCE.serializer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer b() {
                return ea.INSTANCE.serializer();
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0260c)) {
                    return false;
                }
                C0260c c0260c = (C0260c) other;
                return Intrinsics.f(this.highlight, c0260c.highlight) && Intrinsics.f(this.background, c0260c.background);
            }

            public int hashCode() {
                return (this.highlight.hashCode() * 31) + this.background.hashCode();
            }

            public String toString() {
                return "ToggleElement(highlight=" + this.highlight + ", background=" + this.background + ")";
            }

            public C0260c(ea highlight, ea background) {
                Intrinsics.checkNotNullParameter(highlight, "highlight");
                Intrinsics.checkNotNullParameter(background, "background");
                this.highlight = highlight;
                this.background = background;
            }

            public static final /* synthetic */ void a(C0260c self, CompositeEncoder output, SerialDescriptor serialDesc) {
                Lazy[] lazyArr = f31837c;
                output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.highlight);
                output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.background);
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            k = new Lazy[]{yhm.j.c(kVar, new wp1(15)), yhm.j.c(kVar, new wp1(16)), null, null, null, null, yhm.j.c(kVar, new wp1(17)), yhm.j.c(kVar, new wp1(18)), null, null};
        }

        public /* synthetic */ c(int i, ea eaVar, r21 r21Var, C0260c c0260c, a81 a81Var, a81 a81Var2, a81 a81Var3, int i2, ea eaVar2, float f, i8 i8Var, SerializationConstructorMarker serializationConstructorMarker) {
            if (511 != (i & 511)) {
                qlm.j1.f(a.f31835a.getDescriptor(), i, 511);
                throw null;
            }
            this.background = eaVar;
            this.shadow = r21Var;
            this.toggle = c0260c;
            this.text = a81Var;
            this.subtitle = a81Var2;
            this.subline = a81Var3;
            this.radius = i2;
            this.icon = eaVar2;
            this.opacity = f;
            if ((i & 512) == 0) {
                this.border = i8.INSTANCE.a();
            } else {
                this.border = i8Var;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return r21.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer c() {
            return new ny0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer d() {
            return ea.INSTANCE.serializer();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.f(this.background, cVar.background) && Intrinsics.f(this.shadow, cVar.shadow) && Intrinsics.f(this.toggle, cVar.toggle) && Intrinsics.f(this.text, cVar.text) && Intrinsics.f(this.subtitle, cVar.subtitle) && Intrinsics.f(this.subline, cVar.subline) && this.radius == cVar.radius && Intrinsics.f(this.icon, cVar.icon) && Float.compare(this.opacity, cVar.opacity) == 0 && Intrinsics.f(this.border, cVar.border);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ea getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return (((((((((((((((((this.background.hashCode() * 31) + this.shadow.hashCode()) * 31) + this.toggle.hashCode()) * 31) + this.text.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.subline.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.icon.hashCode()) * 31) + Float.hashCode(this.opacity)) * 31) + this.border.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final a81 getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final a81 getText() {
            return this.text;
        }

        public String toString() {
            return "RadioCellElement(background=" + this.background + ", shadow=" + this.shadow + ", toggle=" + this.toggle + ", text=" + this.text + ", subtitle=" + this.subtitle + ", subline=" + this.subline + ", radius=" + this.radius + ", icon=" + this.icon + ", opacity=" + this.opacity + ", border=" + this.border + ")";
        }

        public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = k;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.shadow);
            output.encodeSerializableElement(serialDesc, 2, C0260c.a.f31840a, self.toggle);
            a81.a aVar = a81.a.f26728a;
            output.encodeSerializableElement(serialDesc, 3, aVar, self.text);
            output.encodeSerializableElement(serialDesc, 4, aVar, self.subtitle);
            output.encodeSerializableElement(serialDesc, 5, aVar, self.subline);
            output.encodeSerializableElement(serialDesc, 6, (mlm.h) lazyArr[6].getValue(), Integer.valueOf(self.radius));
            output.encodeSerializableElement(serialDesc, 7, (mlm.h) lazyArr[7].getValue(), self.icon);
            output.encodeFloatElement(serialDesc, 8, self.opacity);
            if (!output.d(serialDesc) && Intrinsics.f(self.border, i8.INSTANCE.a())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 9, i8.a.f29525a, self.border);
        }

        public c(ea background, r21 shadow, C0260c toggle, a81 text, a81 subtitle, a81 subline, int i, ea icon, float f, i8 border) {
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(shadow, "shadow");
            Intrinsics.checkNotNullParameter(toggle, "toggle");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(subline, "subline");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(border, "border");
            this.background = background;
            this.shadow = shadow;
            this.toggle = toggle;
            this.text = text;
            this.subtitle = subtitle;
            this.subline = subline;
            this.radius = i;
            this.icon = icon;
            this.opacity = f;
            this.border = border;
        }

        public /* synthetic */ c(ea eaVar, r21 r21Var, C0260c c0260c, a81 a81Var, a81 a81Var2, a81 a81Var3, int i, ea eaVar2, float f, i8 i8Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(eaVar, r21Var, c0260c, a81Var, a81Var2, a81Var3, i, eaVar2, f, (i2 & 512) != 0 ? i8.INSTANCE.a() : i8Var);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/fourthline/orca/internal/p41$e;", "", "Lcom/fourthline/orca/internal/r21;", "shadow", "<init>", "(Lcom/fourthline/orca/internal/r21;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/r21;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/p41$e;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/r21;", "getShadow", "()Lcom/fourthline/orca/internal/r21;", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Lazy[] f31845b = {yhm.j.c(yhm.k.PUBLICATION, new wp1(21))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final r21 shadow;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31847a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31848b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f31847a = aVar;
                f31848b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement.RadioCellSelectedElement", aVar, 1);
                pluginGeneratedSerialDescriptor.j("shadow", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = e.f31845b;
                dVarBeginStructure.getClass();
                SerializationConstructorMarker serializationConstructorMarker = null;
                boolean z = true;
                int i = 0;
                r21 r21Var = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        r21Var = (r21) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), r21Var);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, r21Var, serializationConstructorMarker);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{e.f31845b[0].getValue()};
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // qlm.f0
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return qlm.j1.f247666a;
            }

            @Override // mlm.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, e value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                e.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.p41$e$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f31847a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ e(int i, r21 r21Var, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i & 1)) {
                this.shadow = r21Var;
            } else {
                qlm.j1.f(a.f31847a.getDescriptor(), i, 1);
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return r21.INSTANCE.serializer();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && Intrinsics.f(this.shadow, ((e) other).shadow);
        }

        public int hashCode() {
            return this.shadow.hashCode();
        }

        public String toString() {
            return "RadioCellSelectedElement(shadow=" + this.shadow + ")";
        }

        public e(r21 shadow) {
            Intrinsics.checkNotNullParameter(shadow, "shadow");
            this.shadow = shadow;
        }

        public static final /* synthetic */ void a(e self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) f31845b[0].getValue(), self.shadow);
        }
    }

    public /* synthetic */ p41(int i, c cVar, d dVar, e eVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f31827a.getDescriptor(), i, 3);
            throw null;
        }
        this.default = cVar;
        this.disabled = dVar;
        if ((i & 4) == 0) {
            this.selected = new e(r21.INSTANCE.a());
        } else {
            this.selected = eVar;
        }
    }

    public static final /* synthetic */ void a(p41 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, c.a.f31835a, self.default);
        output.encodeSerializableElement(serialDesc, 1, d.a.f31843a, self.disabled);
        if (!output.d(serialDesc) && Intrinsics.f(self.selected, new e(r21.INSTANCE.a()))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, e.a.f31847a, self.selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p41)) {
            return false;
        }
        p41 p41Var = (p41) other;
        return Intrinsics.f(this.default, p41Var.default) && Intrinsics.f(this.disabled, p41Var.disabled) && Intrinsics.f(this.selected, p41Var.selected);
    }

    public int hashCode() {
        return (((this.default.hashCode() * 31) + this.disabled.hashCode()) * 31) + this.selected.hashCode();
    }

    public String toString() {
        return "StatefulRadioCellElement(default=" + this.default + ", disabled=" + this.disabled + ", selected=" + this.selected + ")";
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/fourthline/orca/internal/p41$d;", "", "", "opacity", "<init>", "(F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/p41$d;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getOpacity", "()F", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float opacity;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31843a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31844b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f31843a = aVar;
                f31844b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulRadioCellElement.RadioCellElementButReallyOnlyOpacity", aVar, 1);
                pluginGeneratedSerialDescriptor.j("opacity", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                float fDecodeFloatElement = BitmapDescriptorFactory.HUE_RED;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, fDecodeFloatElement, null);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.e0.f247634a};
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // qlm.f0
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return qlm.j1.f247666a;
            }

            @Override // mlm.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, d value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                d.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.p41$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f31843a;
            }

            private Companion() {
            }
        }

        public d(float f) {
            this.opacity = f;
        }

        public static final /* synthetic */ void a(d self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeFloatElement(serialDesc, 0, self.opacity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Float.compare(this.opacity, ((d) other).opacity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.opacity);
        }

        public String toString() {
            return "RadioCellElementButReallyOnlyOpacity(opacity=" + this.opacity + ")";
        }

        public /* synthetic */ d(int i, float f, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i & 1)) {
                this.opacity = f;
            } else {
                qlm.j1.f(a.f31843a.getDescriptor(), i, 1);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDefault() {
        return this.default;
    }

    public p41(c cVar, d disabled, e selected) {
        Intrinsics.checkNotNullParameter(cVar, "default");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.default = cVar;
        this.disabled = disabled;
        this.selected = selected;
    }

    public /* synthetic */ p41(c cVar, d dVar, e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, dVar, (i & 4) != 0 ? new e(r21.INSTANCE.a()) : eVar);
    }
}
