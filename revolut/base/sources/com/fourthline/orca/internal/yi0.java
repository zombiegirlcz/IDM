package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a81;
import com.fourthline.orca.internal.b30;
import com.fourthline.orca.internal.c;
import com.fourthline.orca.internal.e1;
import com.fourthline.orca.internal.m41;
import com.fourthline.orca.internal.o41;
import com.fourthline.orca.internal.p41;
import com.fourthline.orca.internal.pf;
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
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b,\b\u0081\b\u0018\u0000 Z2\u00020\u0001:\t5DFI?3='9Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0093\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010N\u001a\u0004\b=\u0010OR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bD\u0010UR \u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bS\u0010W¨\u0006["}, d2 = {"Lcom/fourthline/orca/internal/yi0;", "", "Lcom/fourthline/orca/internal/yi0$b;", "button", "Lcom/fourthline/orca/internal/yi0$f;", ib.b.Screen, "Lcom/fourthline/orca/internal/yi0$i;", ib.b.Scanner, "Lcom/fourthline/orca/internal/yi0$e;", "graphic", "Lcom/fourthline/orca/internal/q41;", "input", "Lcom/fourthline/orca/internal/pf;", "dialog", "Lcom/fourthline/orca/internal/c10;", "hint", "Lcom/fourthline/orca/internal/p41;", "radio", "Lcom/fourthline/orca/internal/e1;", "agreements", "Lcom/fourthline/orca/internal/c;", "accordion", "Lcom/fourthline/orca/internal/m41;", "checkbox", "Lcom/fourthline/orca/internal/o41;", "linkButton", "<init>", "(Lcom/fourthline/orca/internal/yi0$b;Lcom/fourthline/orca/internal/yi0$f;Lcom/fourthline/orca/internal/yi0$i;Lcom/fourthline/orca/internal/yi0$e;Lcom/fourthline/orca/internal/q41;Lcom/fourthline/orca/internal/pf;Lcom/fourthline/orca/internal/c10;Lcom/fourthline/orca/internal/p41;Lcom/fourthline/orca/internal/e1;Lcom/fourthline/orca/internal/c;Lcom/fourthline/orca/internal/m41;Lcom/fourthline/orca/internal/o41;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/yi0$b;Lcom/fourthline/orca/internal/yi0$f;Lcom/fourthline/orca/internal/yi0$i;Lcom/fourthline/orca/internal/yi0$e;Lcom/fourthline/orca/internal/q41;Lcom/fourthline/orca/internal/pf;Lcom/fourthline/orca/internal/c10;Lcom/fourthline/orca/internal/p41;Lcom/fourthline/orca/internal/e1;Lcom/fourthline/orca/internal/c;Lcom/fourthline/orca/internal/m41;Lcom/fourthline/orca/internal/o41;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/yi0$b;", "e", "()Lcom/fourthline/orca/internal/yi0$b;", "b", "Lcom/fourthline/orca/internal/yi0$f;", "n", "()Lcom/fourthline/orca/internal/yi0$f;", "c", "Lcom/fourthline/orca/internal/yi0$i;", "m", "()Lcom/fourthline/orca/internal/yi0$i;", "d", "Lcom/fourthline/orca/internal/yi0$e;", "h", "()Lcom/fourthline/orca/internal/yi0$e;", "Lcom/fourthline/orca/internal/q41;", "j", "()Lcom/fourthline/orca/internal/q41;", "f", "Lcom/fourthline/orca/internal/pf;", "g", "()Lcom/fourthline/orca/internal/pf;", "Lcom/fourthline/orca/internal/c10;", "i", "()Lcom/fourthline/orca/internal/c10;", "Lcom/fourthline/orca/internal/p41;", "l", "()Lcom/fourthline/orca/internal/p41;", "Lcom/fourthline/orca/internal/e1;", "()Lcom/fourthline/orca/internal/e1;", "Lcom/fourthline/orca/internal/c;", "getAccordion", "()Lcom/fourthline/orca/internal/c;", "k", "Lcom/fourthline/orca/internal/m41;", "()Lcom/fourthline/orca/internal/m41;", "Lcom/fourthline/orca/internal/o41;", "()Lcom/fourthline/orca/internal/o41;", "getLinkButton$annotations", "()V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class yi0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Lazy[] f35309m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b button;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f screen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i scanner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final e graphic;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final q41 input;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final pf dialog;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c10 hint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p41 radio;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final e1 agreements;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c accordion;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final m41 checkbox;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final o41 linkButton;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35318b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f35317a = aVar;
            f35318b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements", aVar, 12);
            pluginGeneratedSerialDescriptor.j("button", false);
            pluginGeneratedSerialDescriptor.j(ib.b.Screen, false);
            pluginGeneratedSerialDescriptor.j(ib.b.Scanner, false);
            pluginGeneratedSerialDescriptor.j("graphic", false);
            pluginGeneratedSerialDescriptor.j("input", false);
            pluginGeneratedSerialDescriptor.j("dialog", false);
            pluginGeneratedSerialDescriptor.j("hint", false);
            pluginGeneratedSerialDescriptor.j("radio", false);
            pluginGeneratedSerialDescriptor.j("agreements", false);
            pluginGeneratedSerialDescriptor.j("accordion", false);
            pluginGeneratedSerialDescriptor.j("checkbox", false);
            pluginGeneratedSerialDescriptor.j("text_with_link", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yi0 deserialize(Decoder decoder) {
            b bVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = yi0.f35309m;
            dVarBeginStructure.getClass();
            e1 e1Var = null;
            o41 o41Var = null;
            c cVar = null;
            m41 m41Var = null;
            b bVar2 = null;
            f fVar = null;
            i iVar = null;
            e eVar = null;
            q41 q41Var = null;
            pf pfVar = null;
            c10 c10Var = null;
            p41 p41Var = null;
            int i = 0;
            boolean z = true;
            while (z) {
                Lazy[] lazyArr2 = lazyArr;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        lazyArr = lazyArr2;
                        i = i;
                        continue;
                    case 0:
                        bVar2 = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b.a.f35322a, bVar2);
                        i |= 1;
                        lazyArr = lazyArr2;
                        continue;
                    case 1:
                        bVar = bVar2;
                        fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, f.a.f35338a, fVar);
                        i |= 2;
                        break;
                    case 2:
                        bVar = bVar2;
                        iVar = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, i.a.f35353a, iVar);
                        i |= 4;
                        break;
                    case 3:
                        bVar = bVar2;
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, e.a.f35332a, eVar);
                        i |= 8;
                        break;
                    case 4:
                        bVar = bVar2;
                        q41Var = (q41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr2[4].getValue(), q41Var);
                        i |= 16;
                        break;
                    case 5:
                        bVar = bVar2;
                        pfVar = (pf) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, pf.a.f31932a, pfVar);
                        i |= 32;
                        break;
                    case 6:
                        bVar = bVar2;
                        c10Var = (c10) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr2[6].getValue(), c10Var);
                        i |= 64;
                        break;
                    case 7:
                        bVar = bVar2;
                        p41Var = (p41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, p41.a.f31827a, p41Var);
                        i |= 128;
                        break;
                    case 8:
                        bVar = bVar2;
                        e1Var = (e1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, e1.a.f27966a, e1Var);
                        i |= 256;
                        break;
                    case 9:
                        bVar = bVar2;
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, c.a.f27294a, cVar);
                        i |= 512;
                        break;
                    case 10:
                        bVar = bVar2;
                        m41Var = (m41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, m41.a.f30982a, m41Var);
                        i |= 1024;
                        break;
                    case 11:
                        bVar = bVar2;
                        o41Var = (o41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, o41.a.f31574a, o41Var);
                        i |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr = lazyArr2;
                bVar2 = bVar;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new yi0(i, bVar2, fVar, iVar, eVar, q41Var, pfVar, c10Var, p41Var, e1Var, cVar, m41Var, o41Var, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = yi0.f35309m;
            return new KSerializer[]{b.a.f35322a, f.a.f35338a, i.a.f35353a, e.a.f35332a, lazyArr[4].getValue(), pf.a.f31932a, lazyArr[6].getValue(), p41.a.f31827a, e1.a.f27966a, c.a.f27294a, m41.a.f30982a, o41.a.f31574a};
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
        public final void serialize(Encoder encoder, yi0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            yi0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002\u0013!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/yi0$b;", "", "Lcom/fourthline/orca/internal/k41;", "primary", "secondary", "tertiary", "<init>", "(Lcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/k41;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/k41;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/k41;", "e", "()Lcom/fourthline/orca/internal/k41;", "b", "getSecondary", "c", "f", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k41 primary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final k41 secondary;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final k41 tertiary;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f35323b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f35322a = aVar;
                f35323b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements.ButtonGroupElement", aVar, 3);
                pluginGeneratedSerialDescriptor.j("primary", false);
                pluginGeneratedSerialDescriptor.j("secondary", false);
                pluginGeneratedSerialDescriptor.j("tertiary", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = b.d;
                dVarBeginStructure.getClass();
                int i = 0;
                k41 k41Var = null;
                k41 k41Var2 = null;
                k41 k41Var3 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        k41Var = (k41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), k41Var);
                        i |= 1;
                    } else if (iD == 1) {
                        k41Var2 = (k41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), k41Var2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        k41Var3 = (k41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), k41Var3);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, k41Var, k41Var2, k41Var3, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = b.d;
                return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue()};
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
            public final void serialize(Encoder encoder, b value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                b.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f35322a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            d = new Lazy[]{yhm.j.c(kVar, new it1(11)), yhm.j.c(kVar, new it1(12)), yhm.j.c(kVar, new it1(13))};
        }

        public /* synthetic */ b(int i, k41 k41Var, k41 k41Var2, k41 k41Var3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                qlm.j1.f(a.f35322a.getDescriptor(), i, 7);
                throw null;
            }
            this.primary = k41Var;
            this.secondary = k41Var2;
            this.tertiary = k41Var3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return k41.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return k41.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer c() {
            return k41.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final k41 getPrimary() {
            return this.primary;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.f(this.primary, bVar.primary) && Intrinsics.f(this.secondary, bVar.secondary) && Intrinsics.f(this.tertiary, bVar.tertiary);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final k41 getTertiary() {
            return this.tertiary;
        }

        public int hashCode() {
            return (((this.primary.hashCode() * 31) + this.secondary.hashCode()) * 31) + this.tertiary.hashCode();
        }

        public String toString() {
            return "ButtonGroupElement(primary=" + this.primary + ", secondary=" + this.secondary + ", tertiary=" + this.tertiary + ")";
        }

        public b(k41 primary, k41 secondary, k41 tertiary) {
            Intrinsics.checkNotNullParameter(primary, "primary");
            Intrinsics.checkNotNullParameter(secondary, "secondary");
            Intrinsics.checkNotNullParameter(tertiary, "tertiary");
            this.primary = primary;
            this.secondary = secondary;
            this.tertiary = tertiary;
        }

        public static final /* synthetic */ void a(b self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = d;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.primary);
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.secondary);
            output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.tertiary);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f35317a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/yi0$d;", "", "Lcom/fourthline/orca/internal/ea;", "highlight", "background", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0$d;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "e", "()Lcom/fourthline/orca/internal/ea;", "b", "d", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Lazy[] f35324c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea highlight;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f35328b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f35327a = aVar;
                f35328b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements.GraphicElement", aVar, 2);
                pluginGeneratedSerialDescriptor.j("highlight", false);
                pluginGeneratedSerialDescriptor.j("background", false);
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
                Lazy[] lazyArr = d.f35324c;
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
                return new d(i, eaVar, eaVar2, serializationConstructorMarker);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = d.f35324c;
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
            public final void serialize(Encoder encoder, d value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                d.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f35327a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f35324c = new Lazy[]{yhm.j.c(kVar, new it1(14)), yhm.j.c(kVar, new it1(15))};
        }

        public /* synthetic */ d(int i, ea eaVar, ea eaVar2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                qlm.j1.f(a.f35327a.getDescriptor(), i, 3);
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

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ea getHighlight() {
            return this.highlight;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return Intrinsics.f(this.highlight, dVar.highlight) && Intrinsics.f(this.background, dVar.background);
        }

        public int hashCode() {
            return (this.highlight.hashCode() * 31) + this.background.hashCode();
        }

        public String toString() {
            return "GraphicElement(highlight=" + this.highlight + ", background=" + this.background + ")";
        }

        public d(ea highlight, ea background) {
            Intrinsics.checkNotNullParameter(highlight, "highlight");
            Intrinsics.checkNotNullParameter(background, "background");
            this.highlight = highlight;
            this.background = background;
        }

        public static final /* synthetic */ void a(d self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = f35324c;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.highlight);
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.background);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002\u0016$B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Lcom/fourthline/orca/internal/yi0$e;", "", "Lcom/fourthline/orca/internal/yi0$d;", "info", "warning", "danger", "success", "Lcom/fourthline/orca/internal/br0;", "spinner", "<init>", "(Lcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/br0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/yi0$d;Lcom/fourthline/orca/internal/br0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0$e;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/yi0$d;", "d", "()Lcom/fourthline/orca/internal/yi0$d;", "b", "g", "c", "f", "e", "Lcom/fourthline/orca/internal/br0;", "()Lcom/fourthline/orca/internal/br0;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new it1(16))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d info;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d warning;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final d danger;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final d success;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final br0 spinner;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f35333b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f35332a = aVar;
                f35333b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements.GraphicGroupElement", aVar, 5);
                pluginGeneratedSerialDescriptor.j("info", false);
                pluginGeneratedSerialDescriptor.j("warning", false);
                pluginGeneratedSerialDescriptor.j("danger", false);
                pluginGeneratedSerialDescriptor.j("success", false);
                pluginGeneratedSerialDescriptor.j("spinner", true);
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
                Lazy[] lazyArr = e.f;
                dVarBeginStructure.getClass();
                int i = 0;
                d dVar = null;
                d dVar2 = null;
                d dVar3 = null;
                d dVar4 = null;
                br0 br0Var = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, d.a.f35327a, dVar);
                        i |= 1;
                    } else if (iD == 1) {
                        dVar2 = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, d.a.f35327a, dVar2);
                        i |= 2;
                    } else if (iD == 2) {
                        dVar3 = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, d.a.f35327a, dVar3);
                        i |= 4;
                    } else if (iD == 3) {
                        dVar4 = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, d.a.f35327a, dVar4);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        br0Var = (br0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), br0Var);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, dVar, dVar2, dVar3, dVar4, br0Var, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = e.f;
                d.a aVar = d.a.f35327a;
                return new KSerializer[]{aVar, aVar, aVar, aVar, lazyArr[4].getValue()};
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$e$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f35332a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ e(int i, d dVar, d dVar2, d dVar3, d dVar4, br0 br0Var, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                qlm.j1.f(a.f35332a.getDescriptor(), i, 15);
                throw null;
            }
            this.info = dVar;
            this.warning = dVar2;
            this.danger = dVar3;
            this.success = dVar4;
            if ((i & 16) == 0) {
                this.spinner = br0.INSTANCE.a();
            } else {
                this.spinner = br0Var;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return br0.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getDanger() {
            return this.danger;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final br0 getSpinner() {
            return this.spinner;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return Intrinsics.f(this.info, eVar.info) && Intrinsics.f(this.warning, eVar.warning) && Intrinsics.f(this.danger, eVar.danger) && Intrinsics.f(this.success, eVar.success) && Intrinsics.f(this.spinner, eVar.spinner);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d getWarning() {
            return this.warning;
        }

        public int hashCode() {
            return (((((((this.info.hashCode() * 31) + this.warning.hashCode()) * 31) + this.danger.hashCode()) * 31) + this.success.hashCode()) * 31) + this.spinner.hashCode();
        }

        public String toString() {
            return "GraphicGroupElement(info=" + this.info + ", warning=" + this.warning + ", danger=" + this.danger + ", success=" + this.success + ", spinner=" + this.spinner + ")";
        }

        public static final /* synthetic */ void a(e self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = f;
            d.a aVar = d.a.f35327a;
            output.encodeSerializableElement(serialDesc, 0, aVar, self.info);
            output.encodeSerializableElement(serialDesc, 1, aVar, self.warning);
            output.encodeSerializableElement(serialDesc, 2, aVar, self.danger);
            output.encodeSerializableElement(serialDesc, 3, aVar, self.success);
            if (!output.d(serialDesc) && Intrinsics.f(self.spinner, br0.INSTANCE.a())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, (mlm.h) lazyArr[4].getValue(), self.spinner);
        }

        public e(d info, d warning, d danger, d success, br0 spinner) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(warning, "warning");
            Intrinsics.checkNotNullParameter(danger, "danger");
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(spinner, "spinner");
            this.info = info;
            this.warning = warning;
            this.danger = danger;
            this.success = success;
            this.spinner = spinner;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0002\u0019'B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b/\u00100R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u00101\u0012\u0004\b3\u00104\u001a\u0004\b,\u00102¨\u00066"}, d2 = {"Lcom/fourthline/orca/internal/yi0$f;", "", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/a81;", "header", "title", "message", "Lcom/fourthline/orca/internal/b30;", "instructions", "Lcom/fourthline/orca/internal/yi0$g;", "graphicContainer", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/b30;Lcom/fourthline/orca/internal/yi0$g;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/b30;Lcom/fourthline/orca/internal/yi0$g;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0$f;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "c", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/a81;", "e", "()Lcom/fourthline/orca/internal/a81;", "g", "d", "f", "Lcom/fourthline/orca/internal/b30;", "getInstructions", "()Lcom/fourthline/orca/internal/b30;", "Lcom/fourthline/orca/internal/yi0$g;", "()Lcom/fourthline/orca/internal/yi0$g;", "getGraphicContainer$annotations", "()V", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class f {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Lazy[] f35334g = {yhm.j.c(yhm.k.PUBLICATION, new it1(17)), null, null, null, null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a81 header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final a81 title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final a81 message;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final b30 instructions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final g graphicContainer;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f35339b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f35338a = aVar;
                f35339b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements.PageElement", aVar, 6);
                pluginGeneratedSerialDescriptor.j("background", false);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("message", false);
                pluginGeneratedSerialDescriptor.j("instructions", false);
                pluginGeneratedSerialDescriptor.j("graphic_container", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = f.f35334g;
                dVarBeginStructure.getClass();
                int i = 0;
                ea eaVar = null;
                a81 a81Var = null;
                a81 a81Var2 = null;
                a81 a81Var3 = null;
                b30 b30Var = null;
                g gVar = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                            i |= 1;
                            break;
                        case 1:
                            a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var);
                            i |= 2;
                            break;
                        case 2:
                            a81Var2 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a81.a.f26728a, a81Var2);
                            i |= 4;
                            break;
                        case 3:
                            a81Var3 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a81.a.f26728a, a81Var3);
                            i |= 8;
                            break;
                        case 4:
                            b30Var = (b30) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, b30.a.f26974a, b30Var);
                            i |= 16;
                            break;
                        case 5:
                            gVar = (g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, g.a.f35343a, gVar);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f(i, eaVar, a81Var, a81Var2, a81Var3, b30Var, gVar, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                a81.a aVar = a81.a.f26728a;
                return new KSerializer[]{f.f35334g[0].getValue(), aVar, aVar, aVar, b30.a.f26974a, g.a.f35343a};
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
            public final void serialize(Encoder encoder, f value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                f.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$f$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f35338a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ f(int i, ea eaVar, a81 a81Var, a81 a81Var2, a81 a81Var3, b30 b30Var, g gVar, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                qlm.j1.f(a.f35338a.getDescriptor(), i, 63);
                throw null;
            }
            this.background = eaVar;
            this.header = a81Var;
            this.title = a81Var2;
            this.message = a81Var3;
            this.instructions = b30Var;
            this.graphicContainer = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g getGraphicContainer() {
            return this.graphicContainer;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final a81 getHeader() {
            return this.header;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return Intrinsics.f(this.background, fVar.background) && Intrinsics.f(this.header, fVar.header) && Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.message, fVar.message) && Intrinsics.f(this.instructions, fVar.instructions) && Intrinsics.f(this.graphicContainer, fVar.graphicContainer);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final a81 getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final a81 getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((this.background.hashCode() * 31) + this.header.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.instructions.hashCode()) * 31) + this.graphicContainer.hashCode();
        }

        public String toString() {
            return "PageElement(background=" + this.background + ", header=" + this.header + ", title=" + this.title + ", message=" + this.message + ", instructions=" + this.instructions + ", graphicContainer=" + this.graphicContainer + ")";
        }

        public f(ea background, a81 header, a81 title, a81 message, b30 instructions, g graphicContainer) {
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            Intrinsics.checkNotNullParameter(graphicContainer, "graphicContainer");
            this.background = background;
            this.header = header;
            this.title = title;
            this.message = message;
            this.instructions = instructions;
            this.graphicContainer = graphicContainer;
        }

        public static final /* synthetic */ void a(f self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) f35334g[0].getValue(), self.background);
            a81.a aVar = a81.a.f26728a;
            output.encodeSerializableElement(serialDesc, 1, aVar, self.header);
            output.encodeSerializableElement(serialDesc, 2, aVar, self.title);
            output.encodeSerializableElement(serialDesc, 3, aVar, self.message);
            output.encodeSerializableElement(serialDesc, 4, b30.a.f26974a, self.instructions);
            output.encodeSerializableElement(serialDesc, 5, g.a.f35343a, self.graphicContainer);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u0016$B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012*\b\u0002\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R9\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001c¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/yi0$g;", "", "Lcom/fourthline/orca/internal/ea;", "background", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "<init>", "(Lcom/fourthline/orca/internal/ea;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0$g;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "d", "()Lcom/fourthline/orca/internal/ea;", "b", "I", "e", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class g {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Lazy[] f35340c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int radius;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f35344b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f35343a = aVar;
                f35344b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements.PageGraphicContainerElement", aVar, 2);
                pluginGeneratedSerialDescriptor.j("background", false);
                pluginGeneratedSerialDescriptor.j("radius", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = g.f35340c;
                dVarBeginStructure.getClass();
                SerializationConstructorMarker serializationConstructorMarker = null;
                boolean z = true;
                int i = 0;
                int iIntValue = 0;
                ea eaVar = null;
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
                        iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), Integer.valueOf(iIntValue))).intValue();
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new g(i, eaVar, iIntValue, serializationConstructorMarker);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = g.f35340c;
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
            public final void serialize(Encoder encoder, g value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                g.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$g$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f35343a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f35340c = new Lazy[]{yhm.j.c(kVar, new it1(18)), yhm.j.c(kVar, new it1(19))};
        }

        public /* synthetic */ g(int i, ea eaVar, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                qlm.j1.f(a.f35343a.getDescriptor(), i, 1);
                throw null;
            }
            this.background = eaVar;
            if ((i & 2) == 0) {
                this.radius = 4;
            } else {
                this.radius = i2;
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

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return Intrinsics.f(this.background, gVar.background) && this.radius == gVar.radius;
        }

        public int hashCode() {
            return (this.background.hashCode() * 31) + Integer.hashCode(this.radius);
        }

        public String toString() {
            return "PageGraphicContainerElement(background=" + this.background + ", radius=" + this.radius + ")";
        }

        public g(ea background, int i) {
            Intrinsics.checkNotNullParameter(background, "background");
            this.background = background;
            this.radius = i;
        }

        public static final /* synthetic */ void a(g self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = f35340c;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
            if (!output.d(serialDesc) && self.radius == 4) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), Integer.valueOf(self.radius));
        }

        public /* synthetic */ g(ea eaVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(eaVar, (i2 & 2) != 0 ? 4 : i);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 32\u00020\u0001:\u0002\u0018&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/fourthline/orca/internal/yi0$h;", "", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/a81;", "header", "Lcom/fourthline/orca/internal/k41;", "primary", "secondary", "Lcom/fourthline/orca/internal/b30;", "instructions", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/b30;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/k41;Lcom/fourthline/orca/internal/b30;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0$h;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "e", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/a81;", "f", "()Lcom/fourthline/orca/internal/a81;", "c", "Lcom/fourthline/orca/internal/k41;", "h", "()Lcom/fourthline/orca/internal/k41;", "d", "i", "Lcom/fourthline/orca/internal/b30;", "g", "()Lcom/fourthline/orca/internal/b30;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class h {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a81 header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final k41 primary;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final k41 secondary;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final b30 instructions;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35348a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f35349b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f35348a = aVar;
                f35349b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements.ScannerConfirmationElement", aVar, 5);
                pluginGeneratedSerialDescriptor.j("background", false);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("primary", false);
                pluginGeneratedSerialDescriptor.j("secondary", false);
                pluginGeneratedSerialDescriptor.j("instructions", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = h.f;
                dVarBeginStructure.getClass();
                int i = 0;
                ea eaVar = null;
                a81 a81Var = null;
                k41 k41Var = null;
                k41 k41Var2 = null;
                b30 b30Var = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                        i |= 1;
                    } else if (iD == 1) {
                        a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var);
                        i |= 2;
                    } else if (iD == 2) {
                        k41Var = (k41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), k41Var);
                        i |= 4;
                    } else if (iD == 3) {
                        k41Var2 = (k41) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), k41Var2);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        b30Var = (b30) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, b30.a.f26974a, b30Var);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new h(i, eaVar, a81Var, k41Var, k41Var2, b30Var, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = h.f;
                return new KSerializer[]{lazyArr[0].getValue(), a81.a.f26728a, lazyArr[2].getValue(), lazyArr[3].getValue(), b30.a.f26974a};
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
            public final void serialize(Encoder encoder, h value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                h.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$h$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f35348a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f = new Lazy[]{yhm.j.c(kVar, new it1(20)), null, yhm.j.c(kVar, new it1(21)), yhm.j.c(kVar, new it1(22)), null};
        }

        public /* synthetic */ h(int i, ea eaVar, a81 a81Var, k41 k41Var, k41 k41Var2, b30 b30Var, SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i & 31)) {
                qlm.j1.f(a.f35348a.getDescriptor(), i, 31);
                throw null;
            }
            this.background = eaVar;
            this.header = a81Var;
            this.primary = k41Var;
            this.secondary = k41Var2;
            this.instructions = b30Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return k41.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer c() {
            return k41.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return Intrinsics.f(this.background, hVar.background) && Intrinsics.f(this.header, hVar.header) && Intrinsics.f(this.primary, hVar.primary) && Intrinsics.f(this.secondary, hVar.secondary) && Intrinsics.f(this.instructions, hVar.instructions);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final a81 getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b30 getInstructions() {
            return this.instructions;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final k41 getPrimary() {
            return this.primary;
        }

        public int hashCode() {
            return (((((((this.background.hashCode() * 31) + this.header.hashCode()) * 31) + this.primary.hashCode()) * 31) + this.secondary.hashCode()) * 31) + this.instructions.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final k41 getSecondary() {
            return this.secondary;
        }

        public String toString() {
            return "ScannerConfirmationElement(background=" + this.background + ", header=" + this.header + ", primary=" + this.primary + ", secondary=" + this.secondary + ", instructions=" + this.instructions + ")";
        }

        public h(ea background, a81 header, k41 primary, k41 secondary, b30 instructions) {
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(primary, "primary");
            Intrinsics.checkNotNullParameter(secondary, "secondary");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            this.background = background;
            this.header = header;
            this.primary = primary;
            this.secondary = secondary;
            this.instructions = instructions;
        }

        public static final /* synthetic */ void a(h self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = f;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
            output.encodeSerializableElement(serialDesc, 1, a81.a.f26728a, self.header);
            output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.primary);
            output.encodeSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), self.secondary);
            output.encodeSerializableElement(serialDesc, 4, b30.a.f26974a, self.instructions);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002\u0014 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0014\u0010$¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/yi0$i;", "", "Lcom/fourthline/orca/internal/a81;", "header", "message", "Lcom/fourthline/orca/internal/yi0$h;", "confirmation", "<init>", "(Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/yi0$h;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/yi0$h;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/yi0$i;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/a81;", "b", "()Lcom/fourthline/orca/internal/a81;", "c", "Lcom/fourthline/orca/internal/yi0$h;", "()Lcom/fourthline/orca/internal/yi0$h;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class i {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a81 header;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a81 message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final h confirmation;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f35354b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f35353a = aVar;
                f35354b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingElements.ScannerPageElement", aVar, 3);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("message", false);
                pluginGeneratedSerialDescriptor.j("confirmation", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                a81 a81Var = null;
                a81 a81Var2 = null;
                h hVar = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a81.a.f26728a, a81Var);
                        i |= 1;
                    } else if (iD == 1) {
                        a81Var2 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        hVar = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, h.a.f35348a, hVar);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new i(i, a81Var, a81Var2, hVar, null);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                a81.a aVar = a81.a.f26728a;
                return new KSerializer[]{aVar, aVar, h.a.f35348a};
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
            public final void serialize(Encoder encoder, i value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                i.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yi0$i$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f35353a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ i(int i, a81 a81Var, a81 a81Var2, h hVar, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                qlm.j1.f(a.f35353a.getDescriptor(), i, 7);
                throw null;
            }
            this.header = a81Var;
            this.message = a81Var2;
            this.confirmation = hVar;
        }

        public static final /* synthetic */ void a(i self, CompositeEncoder output, SerialDescriptor serialDesc) {
            a81.a aVar = a81.a.f26728a;
            output.encodeSerializableElement(serialDesc, 0, aVar, self.header);
            output.encodeSerializableElement(serialDesc, 1, aVar, self.message);
            output.encodeSerializableElement(serialDesc, 2, h.a.f35348a, self.confirmation);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a81 getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a81 getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return Intrinsics.f(this.header, iVar.header) && Intrinsics.f(this.message, iVar.message) && Intrinsics.f(this.confirmation, iVar.confirmation);
        }

        public int hashCode() {
            return (((this.header.hashCode() * 31) + this.message.hashCode()) * 31) + this.confirmation.hashCode();
        }

        public String toString() {
            return "ScannerPageElement(header=" + this.header + ", message=" + this.message + ", confirmation=" + this.confirmation + ")";
        }

        public i(a81 header, a81 message, h confirmation) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.header = header;
            this.message = message;
            this.confirmation = confirmation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h getConfirmation() {
            return this.confirmation;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f35309m = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new it1(9)), null, yhm.j.c(kVar, new it1(10)), null, null, null, null, null};
    }

    public /* synthetic */ yi0(int i2, b bVar, f fVar, i iVar, e eVar, q41 q41Var, pf pfVar, c10 c10Var, p41 p41Var, e1 e1Var, c cVar, m41 m41Var, o41 o41Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i2 & 4095)) {
            qlm.j1.f(a.f35317a.getDescriptor(), i2, 4095);
            throw null;
        }
        this.button = bVar;
        this.screen = fVar;
        this.scanner = iVar;
        this.graphic = eVar;
        this.input = q41Var;
        this.dialog = pfVar;
        this.hint = c10Var;
        this.radio = p41Var;
        this.agreements = e1Var;
        this.accordion = cVar;
        this.checkbox = m41Var;
        this.linkButton = o41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return q41.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return c10.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e1 getAgreements() {
        return this.agreements;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getButton() {
        return this.button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yi0)) {
            return false;
        }
        yi0 yi0Var = (yi0) other;
        return Intrinsics.f(this.button, yi0Var.button) && Intrinsics.f(this.screen, yi0Var.screen) && Intrinsics.f(this.scanner, yi0Var.scanner) && Intrinsics.f(this.graphic, yi0Var.graphic) && Intrinsics.f(this.input, yi0Var.input) && Intrinsics.f(this.dialog, yi0Var.dialog) && Intrinsics.f(this.hint, yi0Var.hint) && Intrinsics.f(this.radio, yi0Var.radio) && Intrinsics.f(this.agreements, yi0Var.agreements) && Intrinsics.f(this.accordion, yi0Var.accordion) && Intrinsics.f(this.checkbox, yi0Var.checkbox) && Intrinsics.f(this.linkButton, yi0Var.linkButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m41 getCheckbox() {
        return this.checkbox;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final pf getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e getGraphic() {
        return this.graphic;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.button.hashCode() * 31) + this.screen.hashCode()) * 31) + this.scanner.hashCode()) * 31) + this.graphic.hashCode()) * 31) + this.input.hashCode()) * 31) + this.dialog.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.radio.hashCode()) * 31) + this.agreements.hashCode()) * 31) + this.accordion.hashCode()) * 31) + this.checkbox.hashCode()) * 31) + this.linkButton.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final c10 getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final q41 getInput() {
        return this.input;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final o41 getLinkButton() {
        return this.linkButton;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final p41 getRadio() {
        return this.radio;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final i getScanner() {
        return this.scanner;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final f getScreen() {
        return this.screen;
    }

    public String toString() {
        return "OrcaStylingElements(button=" + this.button + ", screen=" + this.screen + ", scanner=" + this.scanner + ", graphic=" + this.graphic + ", input=" + this.input + ", dialog=" + this.dialog + ", hint=" + this.hint + ", radio=" + this.radio + ", agreements=" + this.agreements + ", accordion=" + this.accordion + ", checkbox=" + this.checkbox + ", linkButton=" + this.linkButton + ")";
    }

    public yi0(b button, f screen, i scanner, e graphic, q41 input, pf dialog, c10 hint, p41 radio, e1 agreements, c accordion, m41 checkbox, o41 linkButton) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        Intrinsics.checkNotNullParameter(graphic, "graphic");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(radio, "radio");
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(accordion, "accordion");
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        this.button = button;
        this.screen = screen;
        this.scanner = scanner;
        this.graphic = graphic;
        this.input = input;
        this.dialog = dialog;
        this.hint = hint;
        this.radio = radio;
        this.agreements = agreements;
        this.accordion = accordion;
        this.checkbox = checkbox;
        this.linkButton = linkButton;
    }

    public static final /* synthetic */ void a(yi0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f35309m;
        output.encodeSerializableElement(serialDesc, 0, b.a.f35322a, self.button);
        output.encodeSerializableElement(serialDesc, 1, f.a.f35338a, self.screen);
        output.encodeSerializableElement(serialDesc, 2, i.a.f35353a, self.scanner);
        output.encodeSerializableElement(serialDesc, 3, e.a.f35332a, self.graphic);
        output.encodeSerializableElement(serialDesc, 4, (mlm.h) lazyArr[4].getValue(), self.input);
        output.encodeSerializableElement(serialDesc, 5, pf.a.f31932a, self.dialog);
        output.encodeSerializableElement(serialDesc, 6, (mlm.h) lazyArr[6].getValue(), self.hint);
        output.encodeSerializableElement(serialDesc, 7, p41.a.f31827a, self.radio);
        output.encodeSerializableElement(serialDesc, 8, e1.a.f27966a, self.agreements);
        output.encodeSerializableElement(serialDesc, 9, c.a.f27294a, self.accordion);
        output.encodeSerializableElement(serialDesc, 10, m41.a.f30982a, self.checkbox);
        output.encodeSerializableElement(serialDesc, 11, o41.a.f31574a, self.linkButton);
    }
}
