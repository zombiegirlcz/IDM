package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b0 extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, b0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j1 unknownFields;

    public b0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j1.f;
    }

    public static void f(b0 b0Var) throws InvalidProtocolBufferException {
        if (!l(b0Var, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static b0 i(Class cls) {
        b0 b0Var = defaultInstanceMap.get(cls);
        if (b0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (b0Var != null) {
            return b0Var;
        }
        b0 defaultInstanceForType = ((b0) s1.b(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object k(Method method, b0 b0Var, Object... objArr) {
        try {
            return method.invoke(b0Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean l(b0 b0Var, boolean z) {
        byte bByteValue = ((Byte) b0Var.h(a0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        d1 d1Var = d1.f49352c;
        d1Var.getClass();
        boolean zIsInitialized = d1Var.a(b0Var.getClass()).isInitialized(b0Var);
        if (z) {
            b0Var.h(a0.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zIsInitialized;
    }

    public static b0 q(b0 b0Var, j jVar, q qVar) throws InvalidProtocolBufferException {
        i iVar = (i) jVar;
        k kVarI = cd.e.i(iVar.d, iVar.f(), iVar.size(), true);
        b0 b0VarR = r(b0Var, kVarI, qVar);
        kVarI.b(0);
        f(b0VarR);
        return b0VarR;
    }

    public static b0 r(b0 b0Var, cd.e eVar, q qVar) throws InvalidProtocolBufferException {
        b0 b0VarP = b0Var.p();
        try {
            d1 d1Var = d1.f49352c;
            d1Var.getClass();
            g1 g1VarA = d1Var.a(b0VarP.getClass());
            m mVar = (m) eVar.f23134b;
            if (mVar == null) {
                mVar = new m(eVar);
            }
            g1VarA.b(b0VarP, mVar, qVar);
            g1VarA.makeImmutable(b0VarP);
            return b0VarP;
        } catch (InvalidProtocolBufferException e) {
            if (e.f49345a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    public static void s(Class cls, b0 b0Var) {
        b0Var.n();
        defaultInstanceMap.put(cls, b0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int a(g1 g1Var) {
        int iE;
        int iE2;
        if (m()) {
            if (g1Var == null) {
                d1 d1Var = d1.f49352c;
                d1Var.getClass();
                iE2 = d1Var.a(getClass()).e(this);
            } else {
                iE2 = g1Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(a0.d.n("serialized size must be non-negative, was ", iE2));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (g1Var == null) {
            d1 d1Var2 = d1.f49352c;
            d1Var2.getClass();
            iE = d1Var2.a(getClass()).e(this);
        } else {
            iE = g1Var.e(this);
        }
        t(iE);
        return iE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final void e(n nVar) {
        d1 d1Var = d1.f49352c;
        d1Var.getClass();
        g1 g1VarA = d1Var.a(getClass());
        p0 p0Var = nVar.f49391a;
        if (p0Var == null) {
            p0Var = new p0(nVar);
        }
        g1VarA.f(this, p0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        d1 d1Var = d1.f49352c;
        d1Var.getClass();
        return d1Var.a(getClass()).c(this, (b0) obj2);
    }

    public final y g() {
        return (y) h(a0.NEW_BUILDER);
    }

    public abstract Object h(a0 a0Var);

    public final int hashCode() {
        if (m()) {
            d1 d1Var = d1.f49352c;
            d1Var.getClass();
            return d1Var.a(getClass()).d(this);
        }
        if (this.memoizedHashCode == 0) {
            d1 d1Var2 = d1.f49352c;
            d1Var2.getClass();
            this.memoizedHashCode = d1Var2.a(getClass()).d(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final b0 getDefaultInstanceForType() {
        return (b0) h(a0.GET_DEFAULT_INSTANCE);
    }

    public final boolean m() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final y c() {
        return (y) h(a0.NEW_BUILDER);
    }

    public final b0 p() {
        return (b0) h(a0.NEW_MUTABLE_INSTANCE);
    }

    public final void t(int i) {
        if (i < 0) {
            throw new IllegalStateException(a0.d.n("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = v0.f49418a;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("# ");
        sb6.append(string);
        v0.c(this, sb6, 0);
        return sb6.toString();
    }

    public final y u() {
        y yVar = (y) h(a0.NEW_BUILDER);
        if (!yVar.f49435a.equals(this)) {
            yVar.e();
            y.f(yVar.f49436b, this);
        }
        return yVar;
    }
}
