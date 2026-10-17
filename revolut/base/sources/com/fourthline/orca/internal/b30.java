package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a81;
import com.fourthline.orca.internal.ea;
import com.fourthline.orca.internal.i8;
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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u0000 C2\u00020\u0001:\u00033!/B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012*\b\u0002\u0010\u000b\u001a$0\u0006j\u0011`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R9\u0010\u000b\u001a$0\u0006j\u0011`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b<\u00109R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u00109R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b?\u0010.R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b=\u0010.R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010B¨\u0006D"}, d2 = {"Lcom/fourthline/orca/internal/b30;", "", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/i8;", "border", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "Lcom/fourthline/orca/internal/a81;", "header", "title", "text", "message", "icon", "bullet", "Lcom/fourthline/orca/internal/b30$c;", "pagination", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/b30$c;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/b30$c;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b30;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "f", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/i8;", "getBorder", "()Lcom/fourthline/orca/internal/i8;", "c", "I", "k", "d", "Lcom/fourthline/orca/internal/a81;", "getHeader", "()Lcom/fourthline/orca/internal/a81;", "e", "getTitle", "l", "g", "i", "h", "j", "Lcom/fourthline/orca/internal/b30$c;", "()Lcom/fourthline/orca/internal/b30$c;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b30 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ea background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i8 border;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int radius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final a81 header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final a81 title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final a81 text;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a81 message;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ea icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ea bullet;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c pagination;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26975b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f26974a = aVar;
            f26975b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.InstructionBoxElement", aVar, 10);
            pluginGeneratedSerialDescriptor.j("background", true);
            pluginGeneratedSerialDescriptor.j("border", true);
            pluginGeneratedSerialDescriptor.j("radius", true);
            pluginGeneratedSerialDescriptor.j("header", true);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("text", true);
            pluginGeneratedSerialDescriptor.j("message", true);
            pluginGeneratedSerialDescriptor.j("icon", true);
            pluginGeneratedSerialDescriptor.j("bullet", true);
            pluginGeneratedSerialDescriptor.j("pagination", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b30 deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = b30.k;
            dVarBeginStructure.getClass();
            ea eaVar = null;
            c cVar = null;
            ea eaVar2 = null;
            i8 i8Var = null;
            a81 a81Var = null;
            a81 a81Var2 = null;
            a81 a81Var3 = null;
            a81 a81Var4 = null;
            ea eaVar3 = null;
            boolean z = true;
            int i = 0;
            int iIntValue = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        lazyArr = lazyArr2;
                        eaVar2 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar2);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        i8Var = (i8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, i8.a.f29525a, i8Var);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr2[2].getValue(), Integer.valueOf(iIntValue))).intValue();
                        i |= 4;
                        break;
                    case 3:
                        a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a81.a.f26728a, a81Var);
                        i |= 8;
                        continue;
                    case 4:
                        a81Var2 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a81.a.f26728a, a81Var2);
                        i |= 16;
                        continue;
                    case 5:
                        a81Var3 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, a81.a.f26728a, a81Var3);
                        i |= 32;
                        continue;
                    case 6:
                        a81Var4 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, a81.a.f26728a, a81Var4);
                        i |= 64;
                        continue;
                    case 7:
                        eaVar3 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr2[7].getValue(), eaVar3);
                        i |= 128;
                        continue;
                    case 8:
                        eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr2[8].getValue(), eaVar);
                        i |= 256;
                        continue;
                    case 9:
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, c.a.f26979a, cVar);
                        i |= 512;
                        continue;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b30(i, eaVar2, i8Var, iIntValue, a81Var, a81Var2, a81Var3, a81Var4, eaVar3, eaVar, cVar, (SerializationConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b30.k;
            a81.a aVar = a81.a.f26728a;
            return new KSerializer[]{lazyArr[0].getValue(), i8.a.f29525a, lazyArr[2].getValue(), aVar, aVar, aVar, aVar, lazyArr[7].getValue(), lazyArr[8].getValue(), c.a.f26979a};
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
        public final void serialize(Encoder encoder, b30 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            b30.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b30$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f26974a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/b30$c;", "", "Lcom/fourthline/orca/internal/ea;", "inactive", "active", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b30$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "e", "()Lcom/fourthline/orca/internal/ea;", "b", "d", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Lazy[] f26976c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea inactive;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ea active;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f26980b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f26979a = aVar;
                f26980b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.InstructionBoxElement.Pagination", aVar, 2);
                pluginGeneratedSerialDescriptor.j("inactive", false);
                pluginGeneratedSerialDescriptor.j("active", false);
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
                Lazy[] lazyArr = c.f26976c;
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
                return new c(i, eaVar, eaVar2, serializationConstructorMarker);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = c.f26976c;
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
            public final void serialize(Encoder encoder, c value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                c.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.b30$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f26979a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f26976c = new Lazy[]{yhm.j.c(kVar, new vk1(13)), yhm.j.c(kVar, new vk1(14))};
        }

        public /* synthetic */ c(int i, ea eaVar, ea eaVar2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                qlm.j1.f(a.f26979a.getDescriptor(), i, 3);
                throw null;
            }
            this.inactive = eaVar;
            this.active = eaVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ea getActive() {
            return this.active;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ea getInactive() {
            return this.inactive;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.f(this.inactive, cVar.inactive) && Intrinsics.f(this.active, cVar.active);
        }

        public int hashCode() {
            return (this.inactive.hashCode() * 31) + this.active.hashCode();
        }

        public String toString() {
            return "Pagination(inactive=" + this.inactive + ", active=" + this.active + ")";
        }

        public c(ea inactive, ea active) {
            Intrinsics.checkNotNullParameter(inactive, "inactive");
            Intrinsics.checkNotNullParameter(active, "active");
            this.inactive = inactive;
            this.active = active;
        }

        public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = f26976c;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.inactive);
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.active);
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        k = new Lazy[]{yhm.j.c(kVar, new vk1(9)), null, yhm.j.c(kVar, new vk1(10)), null, null, null, null, yhm.j.c(kVar, new vk1(11)), yhm.j.c(kVar, new vk1(12)), null};
    }

    public /* synthetic */ b30(int i, ea eaVar, i8 i8Var, int i2, a81 a81Var, a81 a81Var2, a81 a81Var3, a81 a81Var4, ea eaVar2, ea eaVar3, c cVar, SerializationConstructorMarker serializationConstructorMarker) {
        this.background = (i & 1) == 0 ? ea.INSTANCE.b() : eaVar;
        if ((i & 2) == 0) {
            this.border = i8.INSTANCE.a();
        } else {
            this.border = i8Var;
        }
        if ((i & 4) == 0) {
            this.radius = 0;
        } else {
            this.radius = i2;
        }
        if ((i & 8) == 0) {
            this.header = a81.INSTANCE.a();
        } else {
            this.header = a81Var;
        }
        if ((i & 16) == 0) {
            this.title = a81.INSTANCE.a();
        } else {
            this.title = a81Var2;
        }
        if ((i & 32) == 0) {
            this.text = a81.INSTANCE.a();
        } else {
            this.text = a81Var3;
        }
        if ((i & 64) == 0) {
            this.message = a81.INSTANCE.a();
        } else {
            this.message = a81Var4;
        }
        if ((i & 128) == 0) {
            this.icon = ea.INSTANCE.a();
        } else {
            this.icon = eaVar2;
        }
        if ((i & 256) == 0) {
            this.bullet = ea.INSTANCE.a();
        } else {
            this.bullet = eaVar3;
        }
        if ((i & 512) != 0) {
            this.pagination = cVar;
        } else {
            ea.Companion aVar = ea.INSTANCE;
            this.pagination = new c(aVar.b(), aVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return ea.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new ny0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer c() {
        return ea.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer d() {
        return ea.INSTANCE.serializer();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b30)) {
            return false;
        }
        b30 b30Var = (b30) other;
        return Intrinsics.f(this.background, b30Var.background) && Intrinsics.f(this.border, b30Var.border) && this.radius == b30Var.radius && Intrinsics.f(this.header, b30Var.header) && Intrinsics.f(this.title, b30Var.title) && Intrinsics.f(this.text, b30Var.text) && Intrinsics.f(this.message, b30Var.message) && Intrinsics.f(this.icon, b30Var.icon) && Intrinsics.f(this.bullet, b30Var.bullet) && Intrinsics.f(this.pagination, b30Var.pagination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ea getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ea getBullet() {
        return this.bullet;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ea getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (((((((((((((((((this.background.hashCode() * 31) + this.border.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.header.hashCode()) * 31) + this.title.hashCode()) * 31) + this.text.hashCode()) * 31) + this.message.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.bullet.hashCode()) * 31) + this.pagination.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a81 getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getPagination() {
        return this.pagination;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final a81 getText() {
        return this.text;
    }

    public String toString() {
        return "InstructionBoxElement(background=" + this.background + ", border=" + this.border + ", radius=" + this.radius + ", header=" + this.header + ", title=" + this.title + ", text=" + this.text + ", message=" + this.message + ", icon=" + this.icon + ", bullet=" + this.bullet + ", pagination=" + this.pagination + ")";
    }

    public static final /* synthetic */ void a(b30 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = k;
        if (output.d(serialDesc) || !Intrinsics.f(self.background, ea.INSTANCE.b())) {
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.border, i8.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 1, i8.a.f29525a, self.border);
        }
        if (output.d(serialDesc) || self.radius != 0) {
            output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), Integer.valueOf(self.radius));
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.header, a81.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 3, a81.a.f26728a, self.header);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.title, a81.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 4, a81.a.f26728a, self.title);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.text, a81.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 5, a81.a.f26728a, self.text);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.message, a81.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 6, a81.a.f26728a, self.message);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.icon, ea.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 7, (mlm.h) lazyArr[7].getValue(), self.icon);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.bullet, ea.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 8, (mlm.h) lazyArr[8].getValue(), self.bullet);
        }
        if (!output.d(serialDesc)) {
            c cVar = self.pagination;
            ea.Companion aVar = ea.INSTANCE;
            if (Intrinsics.f(cVar, new c(aVar.b(), aVar.b()))) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 9, c.a.f26979a, self.pagination);
    }

    public b30(ea background, i8 border, int i, a81 header, a81 title, a81 text, a81 message, ea icon, ea bullet, c pagination) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(bullet, "bullet");
        Intrinsics.checkNotNullParameter(pagination, "pagination");
        this.background = background;
        this.border = border;
        this.radius = i;
        this.header = header;
        this.title = title;
        this.text = text;
        this.message = message;
        this.icon = icon;
        this.bullet = bullet;
        this.pagination = pagination;
    }

    public /* synthetic */ b30(ea eaVar, i8 i8Var, int i, a81 a81Var, a81 a81Var2, a81 a81Var3, a81 a81Var4, ea eaVar2, ea eaVar3, c cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        eaVar = (i2 & 1) != 0 ? ea.INSTANCE.b() : eaVar;
        i8Var = (i2 & 2) != 0 ? i8.INSTANCE.a() : i8Var;
        i = (i2 & 4) != 0 ? 0 : i;
        a81Var = (i2 & 8) != 0 ? a81.INSTANCE.a() : a81Var;
        a81Var2 = (i2 & 16) != 0 ? a81.INSTANCE.a() : a81Var2;
        a81Var3 = (i2 & 32) != 0 ? a81.INSTANCE.a() : a81Var3;
        a81Var4 = (i2 & 64) != 0 ? a81.INSTANCE.a() : a81Var4;
        eaVar2 = (i2 & 128) != 0 ? ea.INSTANCE.a() : eaVar2;
        eaVar3 = (i2 & 256) != 0 ? ea.INSTANCE.a() : eaVar3;
        if ((i2 & 512) != 0) {
            ea.Companion aVar = ea.INSTANCE;
            cVar = new c(aVar.b(), aVar.b());
        }
        this(eaVar, i8Var, i, a81Var, a81Var2, a81Var3, a81Var4, eaVar2, eaVar3, cVar);
    }
}
