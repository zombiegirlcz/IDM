package slm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes14.dex */
public final class f0 extends plm.b implements rlm.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dki.h f264255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Json f264256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f264257c;
    public final rlm.m[] d;
    public final tlm.e e;
    public final rlm.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f264258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f264259h;
    public String i;

    public f0(dki.h composer, Json json, j0 mode, rlm.m[] mVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f264255a = composer;
        this.f264256b = json;
        this.f264257c = mode;
        this.d = mVarArr;
        this.e = json.f187949b;
        this.f = json.f187948a;
        int iOrdinal = mode.ordinal();
        if (mVarArr != null) {
            rlm.m mVar = mVarArr[iOrdinal];
            if (mVar == null && mVar == this) {
                return;
            }
            mVarArr[iOrdinal] = this;
        }
    }

    @Override // rlm.m
    public final Json a() {
        return this.f264256b;
    }

    @Override // rlm.m
    public final void b(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f264259h == null || (element instanceof JsonObject)) {
            encodeSerializableValue(rlm.k.f255111a, element);
        } else {
            q.s(element, this.i);
            throw null;
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        rlm.m mVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Json json = this.f264256b;
        j0 j0VarQ = q.q(descriptor, json);
        char c2 = j0VarQ.begin;
        dki.h hVar = this.f264255a;
        if (c2 != 0) {
            hVar.r(c2);
            hVar.f115542b = true;
        }
        String str = this.f264259h;
        if (str != null) {
            String strE = this.i;
            if (strE == null) {
                strE = descriptor.e();
            }
            hVar.p();
            encodeString(str);
            hVar.r(CoreConstants.COLON_CHAR);
            hVar.getClass();
            encodeString(strE);
            this.f264259h = null;
            this.i = null;
        }
        if (this.f264257c == j0VarQ) {
            return this;
        }
        rlm.m[] mVarArr = this.d;
        return (mVarArr == null || (mVar = mVarArr[j0VarQ.ordinal()]) == null) ? new f0(hVar, json, j0VarQ, mVarArr) : mVar;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final boolean d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f.f255104a;
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z) {
        if (this.f264258g) {
            encodeString(String.valueOf(z));
        } else {
            ((a80.e) this.f264255a.f115543c).q(String.valueOf(z));
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b4) {
        if (this.f264258g) {
            encodeString(String.valueOf((int) b4));
        } else {
            this.f264255a.q(b4);
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c2) {
        encodeString(String.valueOf(c2));
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d) {
        boolean z = this.f264258g;
        dki.h hVar = this.f264255a;
        if (z) {
            encodeString(String.valueOf(d));
        } else {
            ((a80.e) hVar.f115543c).q(String.valueOf(d));
        }
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        throw q.a(((a80.e) hVar.f115543c).toString(), Double.valueOf(d));
    }

    @Override // plm.b
    public final boolean encodeElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = e0.f264253a[this.f264257c.ordinal()];
        dki.h hVar = this.f264255a;
        if (i2 == 1) {
            if (!hVar.f115542b) {
                hVar.r(CoreConstants.COMMA_CHAR);
            }
            hVar.p();
            return true;
        }
        boolean z = false;
        if (i2 == 2) {
            if (hVar.f115542b) {
                this.f264258g = true;
                hVar.p();
                return true;
            }
            if (i % 2 == 0) {
                hVar.r(CoreConstants.COMMA_CHAR);
                hVar.p();
                z = true;
            } else {
                hVar.r(CoreConstants.COLON_CHAR);
                hVar.x();
            }
            this.f264258g = z;
            return true;
        }
        if (i2 == 3) {
            if (i == 0) {
                this.f264258g = true;
            }
            if (i == 1) {
                hVar.r(CoreConstants.COMMA_CHAR);
                hVar.x();
                this.f264258g = false;
            }
            return true;
        }
        if (!hVar.f115542b) {
            hVar.r(CoreConstants.COMMA_CHAR);
        }
        hVar.p();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Json json = this.f264256b;
        Intrinsics.checkNotNullParameter(json, "json");
        q.p(descriptor, json);
        encodeString(descriptor.d(i));
        hVar.r(CoreConstants.COLON_CHAR);
        hVar.x();
        return true;
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.d(i));
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f) {
        boolean z = this.f264258g;
        dki.h hVar = this.f264255a;
        if (z) {
            encodeString(String.valueOf(f));
        } else {
            ((a80.e) hVar.f115543c).q(String.valueOf(f));
        }
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        throw q.a(((a80.e) hVar.f115543c).toString(), Float.valueOf(f));
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean zA = g0.a(descriptor);
        j0 j0Var = this.f264257c;
        Json json = this.f264256b;
        dki.h lVar = this.f264255a;
        if (zA) {
            if (!(lVar instanceof m)) {
                lVar = new m((a80.e) lVar.f115543c, this.f264258g);
            }
            return new f0(lVar, json, j0Var, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.isInline() && descriptor.equals(rlm.j.f255110a)) {
            if (!(lVar instanceof l)) {
                lVar = new l((a80.e) lVar.f115543c, this.f264258g);
            }
            return new f0(lVar, json, j0Var, null);
        }
        if (this.f264259h == null) {
            return super.encodeInline(descriptor);
        }
        this.i = descriptor.e();
        return this;
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i) {
        if (this.f264258g) {
            encodeString(String.valueOf(i));
        } else {
            this.f264255a.s(i);
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j2) {
        if (this.f264258g) {
            encodeString(String.valueOf(j2));
        } else {
            this.f264255a.t(j2);
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
        this.f264255a.u("null");
    }

    @Override // plm.b, kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeNullableSerializableElement(SerialDescriptor descriptor, int i, mlm.h serializer, Object obj2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj2 != null || this.f.d) {
            super.encodeNullableSerializableElement(descriptor, i, serializer, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void encodeSerializableValue(mlm.h r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlinx.serialization.json.Json r0 = r4.f264256b
            rlm.h r1 = r0.f187948a
            boolean r2 = r5 instanceof qlm.b
            if (r2 == 0) goto L14
            rlm.a r1 = r1.f255109j
            rlm.a r3 = rlm.a.NONE
            if (r1 == r3) goto L4e
            goto L3f
        L14:
            rlm.a r1 = r1.f255109j
            int[] r3 = slm.a0.f264235a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L4e
            r3 = 2
            if (r1 == r3) goto L4e
            r3 = 3
            if (r1 != r3) goto L48
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            com.bumptech.glide.d r1 = r1.getKind()
            olm.k r3 = olm.k.f226487b
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r3 != 0) goto L3f
            olm.k r3 = olm.k.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 == 0) goto L4e
        L3f:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            java.lang.String r0 = slm.q.j(r1, r0)
            goto L4f
        L48:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4e:
            r0 = 0
        L4f:
            if (r2 == 0) goto L8d
            r1 = r5
            qlm.b r1 = (qlm.b) r1
            if (r6 == 0) goto L6c
            mlm.h r1 = com.bumptech.glide.d.g(r1, r4, r6)
            if (r0 == 0) goto L6a
            slm.q.e(r5, r1, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getDescriptor()
            com.bumptech.glide.d r5 = r5.getKind()
            slm.q.i(r5)
        L6a:
            r5 = r1
            goto L8d
        L6c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Value for serializer "
            r5.<init>(r6)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r1.getDescriptor()
            r5.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L8d:
            if (r0 == 0) goto L9b
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getDescriptor()
            java.lang.String r1 = r1.e()
            r4.f264259h = r0
            r4.i = r1
        L9b:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: slm.f0.encodeSerializableValue(mlm.h, java.lang.Object):void");
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s2) {
        if (this.f264258g) {
            encodeString(String.valueOf((int) s2));
        } else {
            this.f264255a.v(s2);
        }
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public final void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f264255a.w(value);
    }

    @Override // plm.b, kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        j0 j0Var = this.f264257c;
        if (j0Var.f264269end != 0) {
            dki.h hVar = this.f264255a;
            hVar.getClass();
            hVar.f115542b = false;
            hVar.r(j0Var.f264269end);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final tlm.e getSerializersModule() {
        return this.e;
    }
}
