package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import a0.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.q;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final List d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f187454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f187455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f187456c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strK0 = d0.k0(v.k('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, 62);
        List listK = v.k(d.r(strK0, "/Any"), d.r(strK0, "/Nothing"), d.r(strK0, "/Unit"), d.r(strK0, "/Throwable"), d.r(strK0, "/Number"), d.r(strK0, "/Byte"), d.r(strK0, "/Double"), d.r(strK0, "/Float"), d.r(strK0, "/Int"), d.r(strK0, "/Long"), d.r(strK0, "/Short"), d.r(strK0, "/Boolean"), d.r(strK0, "/Char"), d.r(strK0, "/CharSequence"), d.r(strK0, "/String"), d.r(strK0, "/Comparable"), d.r(strK0, "/Enum"), d.r(strK0, "/Array"), d.r(strK0, "/ByteArray"), d.r(strK0, "/DoubleArray"), d.r(strK0, "/FloatArray"), d.r(strK0, "/IntArray"), d.r(strK0, "/LongArray"), d.r(strK0, "/ShortArray"), d.r(strK0, "/BooleanArray"), d.r(strK0, "/CharArray"), d.r(strK0, "/Cloneable"), d.r(strK0, "/Annotation"), d.r(strK0, "/collections/Iterable"), d.r(strK0, "/collections/MutableIterable"), d.r(strK0, "/collections/Collection"), d.r(strK0, "/collections/MutableCollection"), d.r(strK0, "/collections/List"), d.r(strK0, "/collections/MutableList"), d.r(strK0, "/collections/Set"), d.r(strK0, "/collections/MutableSet"), d.r(strK0, "/collections/Map"), d.r(strK0, "/collections/MutableMap"), d.r(strK0, "/collections/Map.Entry"), d.r(strK0, "/collections/MutableMap.MutableEntry"), d.r(strK0, "/collections/Iterator"), d.r(strK0, "/collections/MutableIterator"), d.r(strK0, "/collections/ListIterator"), d.r(strK0, "/collections/MutableListIterator"));
        d = listK;
        q qVarK1 = d0.k1(listK);
        int iB = q0.b(w.t(qVarK1, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = qVarK1.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) dVar.next();
            linkedHashMap.put((String) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
        }
    }

    public JvmNameResolverBase(@NotNull String[] strings, @NotNull Set<Integer> localNameIndices, @NotNull List<JvmProtoBuf.StringTableTypes.Record> records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f187454a = strings;
        this.f187455b = localNameIndices;
        this.f187456c = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.getString(int):java.lang.String");
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.f187455b.contains(Integer.valueOf(i));
    }
}
