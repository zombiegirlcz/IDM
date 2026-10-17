package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

import java.util.List;
import kjm.a;
import kotlin.Lazy;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadContext;
import kotlin.reflect.jvm.internal.impl.km.internal.WriteContext;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes14.dex */
public interface MetadataExtensions {

    @NotNull
    public static final Companion Companion = Companion.f186835a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f186835a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f186836b = j.b(a.f184497a);

        @NotNull
        public final List<MetadataExtensions> getINSTANCES$kotlin_metadata() {
            return (List) f186836b.getValue();
        }
    }

    @NotNull
    KmClassExtension createClassExtension();

    @NotNull
    KmConstructorExtension createConstructorExtension();

    KmEnumEntryExtension createEnumEntryExtension();

    @NotNull
    KmFunctionExtension createFunctionExtension();

    @NotNull
    KmPropertyExtension createPropertyExtension();

    KmTypeAliasExtension createTypeAliasExtension();

    @NotNull
    KmTypeExtension createTypeExtension();

    @NotNull
    KmTypeParameterExtension createTypeParameterExtension();

    KmValueParameterExtension createValueParameterExtension();

    void readClassExtensions(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class r2, @NotNull ReadContext readContext);

    void readConstructorExtensions(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor constructor, @NotNull ReadContext readContext);

    void readEnumEntryExtensions(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry enumEntry, @NotNull ReadContext readContext);

    void readFunctionExtensions(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function function, @NotNull ReadContext readContext);

    void readPropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property property, @NotNull ReadContext readContext);

    void readTypeAliasExtensions(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull ReadContext readContext);

    void readTypeExtensions(@NotNull KmType kmType, @NotNull ProtoBuf.Type type, @NotNull ReadContext readContext);

    void readTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter typeParameter, @NotNull ReadContext readContext);

    void readValueParameterExtensions(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter valueParameter, @NotNull ReadContext readContext);

    void writePropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property.Builder builder, @NotNull WriteContext writeContext);

    void writeTypeExtensions(@NotNull KmType kmType, @NotNull ProtoBuf.Type.Builder builder, @NotNull WriteContext writeContext);

    void writeTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter.Builder builder, @NotNull WriteContext writeContext);

    void writeValueParameterExtensions(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter.Builder builder, @NotNull WriteContext writeContext);
}
