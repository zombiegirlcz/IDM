package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected m3 unknownFields;

    public w0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = m3.f;
    }

    public static u0 access$000(a0 a0Var) {
        a0Var.getClass();
        return (u0) a0Var;
    }

    public static void b(w0 w0Var) throws InvalidProtocolBufferException {
        if (w0Var == null || w0Var.isInitialized()) {
            return;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = w0Var.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    public static w0 c(w0 w0Var, InputStream inputStream, d0 d0Var) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            t tVarI = t.i(new a(inputStream, t.x(i, inputStream)));
            w0 partialFrom = parsePartialFrom(w0Var, tVarI, d0Var);
            tVarI.a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            if (e.f49676a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage(), e2);
        }
    }

    public static w0 d(w0 w0Var, byte[] bArr, int i, int i2, d0 d0Var) throws InvalidProtocolBufferException {
        w0 w0VarNewMutableInstance = w0Var.newMutableInstance();
        try {
            p2 p2Var = p2.f49764c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(w0VarNewMutableInstance.getClass());
            t2VarA.b(w0VarNewMutableInstance, bArr, i, i + i2, new i(d0Var));
            t2VarA.makeImmutable(w0VarNewMutableInstance);
            return w0VarNewMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            if (e.f49676a) {
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
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static y0 emptyBooleanList() {
        return k.c();
    }

    public static z0 emptyDoubleList() {
        return z.c();
    }

    public static d1 emptyFloatList() {
        return m0.c();
    }

    public static e1 emptyIntList() {
        return x0.d;
    }

    public static h1 emptyLongList() {
        return t1.c();
    }

    public static <E> i1 emptyProtobufList() {
        return q2.d;
    }

    public static <T extends w0> T getDefaultInstance(Class<T> cls) {
        T t2 = (T) defaultInstanceMap.get(cls);
        if (t2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t2 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) ((w0) w3.b(cls)).getDefaultInstanceForType();
        if (t3 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t3);
        return t3;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj2, Object... objArr) {
        try {
            return method.invoke(obj2, objArr);
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

    public static e1 mutableCopy(e1 e1Var) {
        int size = e1Var.size();
        int i = size == 0 ? 10 : size * 2;
        x0 x0Var = (x0) e1Var;
        if (i >= x0Var.f49829c) {
            return new x0(Arrays.copyOf(x0Var.f49828b, i), x0Var.f49829c, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(d2 d2Var, String str, Object[] objArr) {
        return new r2(d2Var, str, objArr);
    }

    public static <ContainingType extends d2, Type> u0 newRepeatedGeneratedExtension(ContainingType containingtype, d2 d2Var, b1 b1Var, int i, k4 k4Var, boolean z, Class cls) {
        return new u0(containingtype, Collections.EMPTY_LIST, d2Var, new t0(b1Var, i, k4Var, true, z));
    }

    public static <ContainingType extends d2, Type> u0 newSingularGeneratedExtension(ContainingType containingtype, Type type, d2 d2Var, b1 b1Var, int i, k4 k4Var, Class cls) {
        return new u0(containingtype, type, d2Var, new t0(b1Var, i, k4Var, false, false));
    }

    public static <T extends w0> T parseDelimitedFrom(T t2, InputStream inputStream) throws InvalidProtocolBufferException {
        T t3 = (T) c(t2, inputStream, d0.b());
        b(t3);
        return t3;
    }

    public static <T extends w0> T parseFrom(T t2, ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        t tVarH;
        if (byteBuffer.hasArray()) {
            tVarH = t.h(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && s.I()) {
            tVarH = new s(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            tVarH = t.h(bArr, 0, iRemaining, true);
        }
        T t3 = (T) parseFrom(t2, tVarH, d0Var);
        b(t3);
        return t3;
    }

    public static <T extends w0> T parsePartialFrom(T t2, t tVar, d0 d0Var) throws InvalidProtocolBufferException {
        T t3 = (T) t2.newMutableInstance();
        try {
            p2 p2Var = p2.f49764c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(t3.getClass());
            v vVar = tVar.f49790c;
            if (vVar == null) {
                vVar = new v(tVar);
            }
            t2VarA.e(t3, vVar, d0Var);
            t2VarA.makeImmutable(t3);
            return t3;
        } catch (InvalidProtocolBufferException e) {
            if (e.f49676a) {
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

    public static <T extends w0> void registerDefaultInstance(Class<T> cls, T t2) {
        t2.markImmutable();
        defaultInstanceMap.put(cls, t2);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(v0.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        p2 p2Var = p2.f49764c;
        p2Var.getClass();
        return p2Var.a(getClass()).c(this);
    }

    public final <MessageType extends w0, BuilderType extends p0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(v0.NEW_BUILDER);
    }

    public Object dynamicMethod(v0 v0Var, Object obj2) {
        return dynamicMethod(v0Var, obj2, null);
    }

    public abstract Object dynamicMethod(v0 v0Var, Object obj2, Object obj3);

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        p2 p2Var = p2.f49764c;
        p2Var.getClass();
        return p2Var.a(getClass()).f(this, (w0) obj2);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.d2
    public final m2 getParserForType() {
        return (m2) dynamicMethod(v0.GET_PARSER);
    }

    @Override // com.google.protobuf.b
    public int getSerializedSize(t2 t2Var) {
        int iD;
        int iD2;
        if (isMutable()) {
            if (t2Var == null) {
                p2 p2Var = p2.f49764c;
                p2Var.getClass();
                iD2 = p2Var.a(getClass()).d(this);
            } else {
                iD2 = t2Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            throw new IllegalStateException(a0.d.n("serialized size must be non-negative, was ", iD2));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (t2Var == null) {
            p2 p2Var2 = p2.f49764c;
            p2Var2.getClass();
            iD = p2Var2.a(getClass()).d(this);
        } else {
            iD = t2Var.d(this);
        }
        setMemoizedSerializedSize(iD);
        return iD;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.e2
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        p2 p2Var = p2.f49764c;
        p2Var.getClass();
        p2Var.a(getClass()).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, p pVar) {
        if (this.unknownFields == m3.f) {
            this.unknownFields = new m3();
        }
        m3 m3Var = this.unknownFields;
        m3Var.a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m3Var.f((i << 3) | 2, pVar);
    }

    public final void mergeUnknownFields(m3 m3Var) {
        this.unknownFields = m3.e(this.unknownFields, m3Var);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == m3.f) {
            this.unknownFields = new m3();
        }
        m3 m3Var = this.unknownFields;
        m3Var.a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m3Var.f(i << 3, Long.valueOf(i2));
    }

    public w0 newMutableInstance() {
        return (w0) dynamicMethod(v0.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i, t tVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == m3.f) {
            this.unknownFields = new m3();
        }
        return this.unknownFields.d(i, tVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(a0.d.n("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = f2.f49704a;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("# ");
        sb6.append(string);
        f2.c(this, sb6, 0);
        return sb6.toString();
    }

    @Override // com.google.protobuf.d2
    public void writeTo(y yVar) throws IOException {
        p2 p2Var = p2.f49764c;
        p2Var.getClass();
        t2 t2VarA = p2Var.a(getClass());
        w1 w1Var = yVar.f49835c;
        if (w1Var == null) {
            w1Var = new w1(yVar);
        }
        t2VarA.a(this, w1Var);
    }

    public static final <T extends w0> boolean isInitialized(T t2, boolean z) {
        byte bByteValue = ((Byte) t2.dynamicMethod(v0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        p2 p2Var = p2.f49764c;
        p2Var.getClass();
        boolean zIsInitialized = p2Var.a(t2.getClass()).isInitialized(t2);
        if (z) {
            t2.dynamicMethod(v0.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t2 : null);
        }
        return zIsInitialized;
    }

    public final <MessageType extends w0, BuilderType extends p0> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.f(messagetype);
        return buildertype;
    }

    public Object dynamicMethod(v0 v0Var) {
        return dynamicMethod(v0Var, null, null);
    }

    @Override // com.google.protobuf.e2
    public final w0 getDefaultInstanceForType() {
        return (w0) dynamicMethod(v0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.d2
    public final p0 newBuilderForType() {
        return (p0) dynamicMethod(v0.NEW_BUILDER);
    }

    @Override // com.google.protobuf.d2
    public final p0 toBuilder() {
        p0 p0Var = (p0) dynamicMethod(v0.NEW_BUILDER);
        p0Var.f(this);
        return p0Var;
    }

    public static <T extends w0> T parseDelimitedFrom(T t2, InputStream inputStream, d0 d0Var) throws InvalidProtocolBufferException {
        T t3 = (T) c(t2, inputStream, d0Var);
        b(t3);
        return t3;
    }

    public static h1 mutableCopy(h1 h1Var) {
        int size = h1Var.size();
        return ((t1) h1Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static d1 mutableCopy(d1 d1Var) {
        int size = d1Var.size();
        return ((m0) d1Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static z0 mutableCopy(z0 z0Var) {
        int size = z0Var.size();
        return ((z) z0Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends w0> T parseFrom(T t2, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t2, byteBuffer, d0.b());
    }

    public static y0 mutableCopy(y0 y0Var) {
        int size = y0Var.size();
        return ((k) y0Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends w0> T parseFrom(T t2, p pVar) throws InvalidProtocolBufferException {
        T t3 = (T) parseFrom(t2, pVar, d0.b());
        b(t3);
        return t3;
    }

    public static <E> i1 mutableCopy(i1 i1Var) {
        int size = i1Var.size();
        return i1Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends w0> T parseFrom(T t2, p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        t tVarH = pVar.h();
        T t3 = (T) parsePartialFrom(t2, tVarH, d0Var);
        tVarH.a(0);
        b(t3);
        return t3;
    }

    public static <T extends w0> T parseFrom(T t2, byte[] bArr) throws InvalidProtocolBufferException {
        T t3 = (T) d(t2, bArr, 0, bArr.length, d0.b());
        b(t3);
        return t3;
    }

    public static <T extends w0> T parseFrom(T t2, byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        T t3 = (T) d(t2, bArr, 0, bArr.length, d0Var);
        b(t3);
        return t3;
    }

    @Override // com.google.protobuf.d2
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends w0> T parseFrom(T t2, InputStream inputStream) throws InvalidProtocolBufferException {
        T t3 = (T) parsePartialFrom(t2, t.i(inputStream), d0.b());
        b(t3);
        return t3;
    }

    public static <T extends w0> T parsePartialFrom(T t2, t tVar) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t2, tVar, d0.b());
    }

    public static <T extends w0> T parseFrom(T t2, InputStream inputStream, d0 d0Var) throws InvalidProtocolBufferException {
        T t3 = (T) parsePartialFrom(t2, t.i(inputStream), d0Var);
        b(t3);
        return t3;
    }

    public static <T extends w0> T parseFrom(T t2, t tVar) throws InvalidProtocolBufferException {
        return (T) parseFrom(t2, tVar, d0.b());
    }

    public static <T extends w0> T parseFrom(T t2, t tVar, d0 d0Var) throws InvalidProtocolBufferException {
        T t3 = (T) parsePartialFrom(t2, tVar, d0Var);
        b(t3);
        return t3;
    }
}
