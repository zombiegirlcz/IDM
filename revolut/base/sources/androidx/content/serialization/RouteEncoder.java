package androidx.content.serialization;

import androidx.content.CollectionNavType;
import androidx.content.NavType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import p.a;
import plm.b;
import tlm.e;
import tlm.h;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "", "T", "Lplm/b;", "Lkotlinx/serialization/KSerializer;", "serializer", "", "", "Landroidx/navigation/NavType;", "typeMap", "<init>", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)V", "value", "", "internalEncodeValue", "(Ljava/lang/Object;)V", "", "encodeToArgMap", "(Ljava/lang/Object;)Ljava/util/Map;", "Lmlm/h;", "encodeSerializableValue", "(Lmlm/h;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "encodeElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "encodeValue", "encodeNull", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/KSerializer;", "Ljava/util/Map;", "Ltlm/e;", "serializersModule", "Ltlm/e;", "getSerializersModule", "()Ltlm/e;", "", "map", "elementIndex", "I", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteEncoder<T> extends b {
    private int elementIndex;

    @NotNull
    private final Map<String, List<String>> map;

    @NotNull
    private final KSerializer serializer;

    @NotNull
    private final e serializersModule;

    @NotNull
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(@NotNull KSerializer serializer, @NotNull Map<String, ? extends NavType<Object>> typeMap) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = h.f272133a;
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void internalEncodeValue(Object value) {
        String strD = this.serializer.getDescriptor().d(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(strD);
        if (navType == null) {
            throw new IllegalStateException(a.p("Cannot find NavType for argument ", strD, ". Please provide NavType through typeMap.").toString());
        }
        this.map.put(strD, navType instanceof CollectionNavType ? ((CollectionNavType) navType).serializeAsValues(value) : u.c(navType.serializeAsValue(value)));
    }

    @Override // plm.b
    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.elementIndex = index;
        return true;
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementIndex = 0;
        }
        return super.encodeInline(descriptor);
    }

    @Override // plm.b, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull mlm.h serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        internalEncodeValue(value);
    }

    @NotNull
    public final Map<String, List<String>> encodeToArgMap(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.encodeSerializableValue(this.serializer, value);
        return r0.u(this.map);
    }

    @Override // plm.b
    public void encodeValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        internalEncodeValue(value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public e getSerializersModule() {
        return this.serializersModule;
    }
}
