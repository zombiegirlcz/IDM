package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes13.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageLite f187508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f187509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageLite f187510c;
        public final e d;
        public final Method e;

        public GeneratedExtension(MessageLite messageLite, Object obj2, MessageLite messageLite2, e eVar, Class cls) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.f187524c == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f187508a = messageLite;
            this.f187509b = obj2;
            this.f187510c = messageLite2;
            this.d = eVar;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.e = null;
                return;
            }
            try {
                this.e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                String name = cls.getName();
                throw new RuntimeException(a0.d.u(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            }
        }

        public final Object a(Object obj2) {
            if (this.d.f187524c.getJavaType() != WireFormat.JavaType.ENUM) {
                return obj2;
            }
            try {
                return this.e.invoke(null, (Integer) obj2);
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

        public final Object b(Object obj2) {
            return this.d.f187524c.getJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj2).getNumber()) : obj2;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return (ContainingType) this.f187508a;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.f187510c;
        }

        public int getNumber() {
            return this.d.f187523b;
        }
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new e(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new e(enumLiteMap, i, fieldType, false, false), cls);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ByteString f187502a = ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public final ByteString getUnknownFields() {
            return this.f187502a;
        }

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.f187502a = byteString;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo3794clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f187503b = c.d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f187504c;

        public final <Type> BuilderType addExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, Type type) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            if (!this.f187504c) {
                this.f187503b = this.f187503b.clone();
                this.f187504c = true;
            }
            this.f187503b.a(generatedExtension.d, generatedExtension.b(type));
            return this;
        }

        public final void b(ExtendableMessage extendableMessage) {
            vjm.e eVar;
            if (!this.f187504c) {
                this.f187503b = this.f187503b.clone();
                this.f187504c = true;
            }
            c cVar = this.f187503b;
            c cVar2 = extendableMessage.f187505a;
            cVar.getClass();
            int i = 0;
            while (true) {
                eVar = cVar2.f187518a;
                if (i >= eVar.f289833b.size()) {
                    break;
                }
                cVar.i((Map.Entry) eVar.f289833b.get(i));
                i++;
            }
            Iterator it8 = eVar.c().iterator();
            while (it8.hasNext()) {
                cVar.i((Map.Entry) it8.next());
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final <Type> BuilderType setExtension(GeneratedExtension<MessageType, Type> generatedExtension, Type type) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            if (!this.f187504c) {
                this.f187503b = this.f187503b.clone();
                this.f187504c = true;
            }
            c cVar = this.f187503b;
            e eVar = generatedExtension.d;
            if (!eVar.d) {
                type = (Type) generatedExtension.b(type);
            } else if (eVar.f187524c.getJavaType() == WireFormat.JavaType.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it8 = ((List) type).iterator();
                while (it8.hasNext()) {
                    arrayList.add(generatedExtension.b(it8.next()));
                }
                type = (Type) arrayList;
            }
            cVar.k(eVar, type);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo3794clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f187505a;

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f187506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry f187507b;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator it8;
                c cVar = extendableMessage.f187505a;
                vjm.e eVar = cVar.f187518a;
                if (cVar.f187520c) {
                    Iterator it9 = ((vjm.k) eVar.entrySet()).iterator();
                    vjm.c cVar2 = new vjm.c();
                    cVar2.f289827a = it9;
                    it8 = cVar2;
                } else {
                    it8 = ((vjm.k) eVar.entrySet()).iterator();
                }
                this.f187506a = it8;
                if (it8.hasNext()) {
                    this.f187507b = (Map.Entry) it8.next();
                }
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry entry = this.f187507b;
                    if (entry == null || ((e) entry.getKey()).f187523b >= i) {
                        return;
                    }
                    e eVar = (e) this.f187507b.getKey();
                    Object value = this.f187507b.getValue();
                    c cVar = c.d;
                    WireFormat.FieldType fieldType = eVar.f187524c;
                    int i2 = eVar.f187523b;
                    if (eVar.d) {
                        List list = (List) value;
                        if (eVar.e) {
                            codedOutputStream.writeTag(i2, 2);
                            Iterator it8 = list.iterator();
                            int iC = 0;
                            while (it8.hasNext()) {
                                iC += c.c(fieldType, it8.next());
                            }
                            codedOutputStream.writeRawVarint32(iC);
                            Iterator it9 = list.iterator();
                            while (it9.hasNext()) {
                                c.n(codedOutputStream, fieldType, it9.next());
                            }
                        } else {
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                c.m(codedOutputStream, fieldType, i2, it10.next());
                            }
                        }
                    } else if (value instanceof LazyField) {
                        c.m(codedOutputStream, fieldType, i2, ((LazyField) value).getValue());
                    } else {
                        c.m(codedOutputStream, fieldType, i2, value);
                    }
                    Iterator it11 = this.f187506a;
                    if (it11.hasNext()) {
                        this.f187507b = (Map.Entry) it11.next();
                    } else {
                        this.f187507b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.f187505a = new c();
        }

        public final int a() {
            vjm.e eVar = this.f187505a.f187518a;
            int iD = 0;
            for (int i = 0; i < eVar.f289833b.size(); i++) {
                Map.Entry entry = (Map.Entry) eVar.f289833b.get(i);
                iD += c.d((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : eVar.c()) {
                iD += c.d((FieldSet$FieldDescriptorLite) entry2.getKey(), entry2.getValue());
            }
            return iD;
        }

        public final void b() {
            this.f187505a.h();
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r11, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r12, int r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.c(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, int):boolean");
        }

        public final void d(GeneratedExtension generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            d(generatedExtension);
            e eVar = generatedExtension.d;
            Type type = (Type) this.f187505a.e(eVar);
            if (type == null) {
                return (Type) generatedExtension.f187509b;
            }
            if (!eVar.d) {
                return (Type) generatedExtension.a(type);
            }
            if (eVar.f187524c.getJavaType() != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r06 = (Type) new ArrayList();
            Iterator it8 = ((List) type).iterator();
            while (it8.hasNext()) {
                r06.add(generatedExtension.a(it8.next()));
            }
            return r06;
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            d(generatedExtension);
            e eVar = generatedExtension.d;
            c cVar = this.f187505a;
            cVar.getClass();
            if (!eVar.d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objE = cVar.e(eVar);
            if (objE == null) {
                return 0;
            }
            return ((List) objE).size();
        }

        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            d(generatedExtension);
            e eVar = generatedExtension.d;
            c cVar = this.f187505a;
            cVar.getClass();
            if (eVar.d) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return cVar.f187518a.get(eVar) != null;
        }

        public ExtendableMessage(ExtendableBuilder extendableBuilder) {
            extendableBuilder.f187503b.h();
            extendableBuilder.f187504c = false;
            this.f187505a = extendableBuilder.f187503b;
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            d(generatedExtension);
            e eVar = generatedExtension.d;
            c cVar = this.f187505a;
            cVar.getClass();
            if (eVar.d) {
                Object objE = cVar.e(eVar);
                if (objE != null) {
                    return (Type) generatedExtension.a(((List) objE).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }
}
