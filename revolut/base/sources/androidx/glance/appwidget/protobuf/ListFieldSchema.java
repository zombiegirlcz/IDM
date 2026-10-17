package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE;
    private static final ListFieldSchema LITE_INSTANCE;

    public static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        public static <E> List<E> getList(Object obj2, long j2) {
            return (List) UnsafeUtil.getObject(obj2, j2);
        }

        @Override // androidx.glance.appwidget.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj2, long j2) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.getObject(obj2, j2);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(obj2, j2, objUnmodifiableList);
        }

        @Override // androidx.glance.appwidget.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj2, Object obj3, long j2) {
            List list = getList(obj3, j2);
            List listMutableListAt = mutableListAt(obj2, j2, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            UnsafeUtil.putObject(obj2, j2, list);
        }

        @Override // androidx.glance.appwidget.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj2, long j2) {
            return mutableListAt(obj2, j2, 10);
        }

        private static <L> List<L> mutableListAt(Object obj2, long j2, int i) {
            List<L> list = getList(obj2, j2);
            if (list.isEmpty()) {
                List<L> lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity(i) : new ArrayList<>(i);
                UnsafeUtil.putObject(obj2, j2, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                UnsafeUtil.putObject(obj2, j2, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(obj2, j2, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list.size() + i);
                    UnsafeUtil.putObject(obj2, j2, protobufListMutableCopyWithCapacity);
                    return protobufListMutableCopyWithCapacity;
                }
            }
            return list;
        }
    }

    public static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object obj2, long j2) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj2, j2);
        }

        @Override // androidx.glance.appwidget.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj2, long j2) {
            getProtobufList(obj2, j2).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r6v1, types: [androidx.glance.appwidget.protobuf.Internal$ProtobufList, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3 */
        @Override // androidx.glance.appwidget.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj2, Object obj3, long j2) {
            Internal.ProtobufList protobufList = getProtobufList(obj2, j2);
            ?? protobufList2 = getProtobufList(obj3, j2);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            ?? r06 = protobufList;
            r06 = protobufList;
            if (size > 0 && size2 > 0) {
                boolean zIsModifiable = protobufList.isModifiable();
                ?? MutableCopyWithCapacity = protobufList;
                if (!zIsModifiable) {
                    MutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                MutableCopyWithCapacity.addAll(protobufList2);
                r06 = MutableCopyWithCapacity;
            }
            if (size > 0) {
                protobufList2 = r06;
            }
            UnsafeUtil.putObject(obj2, j2, protobufList2);
        }

        @Override // androidx.glance.appwidget.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj2, long j2) {
            Internal.ProtobufList protobufList = getProtobufList(obj2, j2);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            UnsafeUtil.putObject(obj2, j2, protobufListMutableCopyWithCapacity);
            return protobufListMutableCopyWithCapacity;
        }
    }

    static {
        FULL_INSTANCE = new ListFieldSchemaFull();
        LITE_INSTANCE = new ListFieldSchemaLite();
    }

    public static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    public static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj2, long j2);

    public abstract <L> void mergeListsAt(Object obj2, Object obj3, long j2);

    public abstract <L> List<L> mutableListAt(Object obj2, long j2);

    private ListFieldSchema() {
    }
}
