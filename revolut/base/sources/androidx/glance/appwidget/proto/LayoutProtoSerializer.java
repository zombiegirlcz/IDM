package androidx.glance.appwidget.proto;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/glance/appwidget/proto/LayoutProtoSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutConfig;", "()V", "defaultValue", "getDefaultValue", "()Landroidx/glance/appwidget/proto/LayoutProto$LayoutConfig;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Landroidx/glance/appwidget/proto/LayoutProto$LayoutConfig;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutProtoSerializer implements Serializer<LayoutProto$LayoutConfig> {

    @NotNull
    public static final LayoutProtoSerializer INSTANCE = new LayoutProtoSerializer();

    @NotNull
    private static final LayoutProto$LayoutConfig defaultValue;

    static {
        LayoutProto$LayoutConfig defaultInstance = LayoutProto$LayoutConfig.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        defaultValue = defaultInstance;
    }

    private LayoutProtoSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation<? super LayoutProto$LayoutConfig> continuation) throws IOException {
        try {
            LayoutProto$LayoutConfig from = LayoutProto$LayoutConfig.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(LayoutProto$LayoutConfig layoutProto$LayoutConfig, OutputStream outputStream, Continuation continuation) {
        return writeTo2(layoutProto$LayoutConfig, outputStream, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public LayoutProto$LayoutConfig getDefaultValue() {
        return defaultValue;
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@NotNull LayoutProto$LayoutConfig layoutProto$LayoutConfig, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation) throws IOException {
        layoutProto$LayoutConfig.writeTo(outputStream);
        return Unit.f186387a;
    }
}
