package com.google.protobuf;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 extends w0 implements e2 {
    protected i0 extensions = i0.f49729c;

    private void eagerlyMergeMessageSetExtension(t tVar, u0 u0Var, d0 d0Var, int i) throws IOException {
        parseExtension(tVar, d0Var, u0Var, (i << 3) | 2, i);
    }

    private void mergeMessageSetExtensionFromBytes(p pVar, d0 d0Var, u0 u0Var) throws IOException {
        d2 d2Var = (d2) this.extensions.f49730a.get(u0Var.d);
        c2 builder = d2Var != null ? d2Var.toBuilder() : null;
        if (builder == null) {
            builder = u0Var.d().newBuilderForType();
        }
        p0 p0Var = (p0) builder;
        p0Var.getClass();
        try {
            t tVarH = pVar.h();
            p0Var.e(tVarH, d0Var);
            tVarH.a(0);
            ensureExtensionsAreMutable().o(u0Var.d, u0Var.h(p0Var.a()));
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading " + p0Var.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    private <MessageType extends d2> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, t tVar, d0 d0Var) throws IOException {
        int iF = 0;
        n nVarM = null;
        u0 u0VarA = null;
        while (true) {
            int iE = tVar.E();
            if (iE == 0) {
                break;
            }
            if (iE == 16) {
                iF = tVar.F();
                if (iF != 0) {
                    u0VarA = d0Var.a(iF, messagetype);
                }
            } else if (iE == 26) {
                if (iF == 0 || u0VarA == null) {
                    nVarM = tVar.m();
                } else {
                    eagerlyMergeMessageSetExtension(tVar, u0VarA, d0Var, iF);
                    nVarM = null;
                }
            } else if (!tVar.H(iE)) {
                break;
            }
        }
        tVar.a(12);
        if (nVarM == null || iF == 0) {
            return;
        }
        if (u0VarA != null) {
            mergeMessageSetExtensionFromBytes(nVarM, d0Var, u0VarA);
        } else {
            mergeLengthDelimitedField(iF, nVarM);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean parseExtension(com.google.protobuf.t r8, com.google.protobuf.d0 r9, com.google.protobuf.u0 r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s0.parseExtension(com.google.protobuf.t, com.google.protobuf.d0, com.google.protobuf.u0, int, int):boolean");
    }

    private void verifyExtensionContainingType(u0 u0Var) {
        if (u0Var.b() != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public i0 ensureExtensionsAreMutable() {
        i0 i0Var = this.extensions;
        if (i0Var.f49731b) {
            this.extensions = i0Var.clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.i();
    }

    public int extensionsSerializedSize() {
        return this.extensions.h();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.f();
    }

    @Override // com.google.protobuf.w0, com.google.protobuf.e2
    public /* bridge */ /* synthetic */ d2 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final <Type> Type getExtension(a0 a0Var) {
        u0 u0VarAccess$000 = w0.access$000(a0Var);
        verifyExtensionContainingType(u0VarAccess$000);
        Object obj2 = this.extensions.f49730a.get(u0VarAccess$000.d);
        return obj2 == null ? (Type) u0VarAccess$000.f49798b : (Type) u0VarAccess$000.a(obj2);
    }

    public final <Type> int getExtensionCount(a0 a0Var) {
        u0 u0VarAccess$000 = w0.access$000(a0Var);
        verifyExtensionContainingType(u0VarAccess$000);
        i0 i0Var = this.extensions;
        t0 t0Var = u0VarAccess$000.d;
        i0Var.getClass();
        if (!t0Var.d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = i0Var.f49730a.get(t0Var);
        if (obj2 == null) {
            return 0;
        }
        return ((List) obj2).size();
    }

    public final <Type> boolean hasExtension(a0 a0Var) {
        u0 u0VarAccess$000 = w0.access$000(a0Var);
        verifyExtensionContainingType(u0VarAccess$000);
        i0 i0Var = this.extensions;
        t0 t0Var = u0VarAccess$000.d;
        i0Var.getClass();
        if (t0Var.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return i0Var.f49730a.get(t0Var) != null;
    }

    public final void mergeExtensionFields(s0 s0Var) {
        i0 i0Var = this.extensions;
        if (i0Var.f49731b) {
            this.extensions = i0Var.clone();
        }
        this.extensions.m(s0Var.extensions);
    }

    @Override // com.google.protobuf.w0, com.google.protobuf.d2
    public /* bridge */ /* synthetic */ c2 newBuilderForType() {
        return newBuilderForType();
    }

    public r0 newExtensionWriter() {
        return new r0(this);
    }

    public r0 newMessageSetExtensionWriter() {
        return new r0(this);
    }

    public <MessageType extends d2> boolean parseUnknownField(MessageType messagetype, t tVar, d0 d0Var, int i) throws IOException {
        int i2 = i >>> 3;
        return parseExtension(tVar, d0Var, d0Var.a(i2, messagetype), i, i2);
    }

    public <MessageType extends d2> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, t tVar, d0 d0Var, int i) throws IOException {
        if (i != 11) {
            return (i & 7) == 2 ? parseUnknownField(messagetype, tVar, d0Var, i) : tVar.H(i);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, tVar, d0Var);
        return true;
    }

    @Override // com.google.protobuf.w0, com.google.protobuf.d2
    public /* bridge */ /* synthetic */ c2 toBuilder() {
        return toBuilder();
    }

    public final <Type> Type getExtension(a0 a0Var, int i) {
        u0 u0VarAccess$000 = w0.access$000(a0Var);
        verifyExtensionContainingType(u0VarAccess$000);
        i0 i0Var = this.extensions;
        t0 t0Var = u0VarAccess$000.d;
        i0Var.getClass();
        if (t0Var.d) {
            Object obj2 = i0Var.f49730a.get(t0Var);
            if (obj2 != null) {
                return (Type) u0VarAccess$000.g(((List) obj2).get(i));
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
