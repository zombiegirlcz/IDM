package androidx.glance.appwidget;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.glance.appwidget.proto.LayoutProto$LayoutConfig;
import androidx.glance.appwidget.proto.LayoutProtoSerializer;
import androidx.glance.state.GlanceStateDefinition;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/LayoutStateDefinition;", "Landroidx/glance/state/GlanceStateDefinition;", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutConfig;", "()V", "getDataStore", "Landroidx/datastore/core/DataStore;", "context", "Landroid/content/Context;", "fileKey", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocation", "Ljava/io/File;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LayoutStateDefinition implements GlanceStateDefinition<LayoutProto$LayoutConfig> {

    @NotNull
    public static final LayoutStateDefinition INSTANCE = new LayoutStateDefinition();

    /* JADX INFO: renamed from: androidx.glance.appwidget.LayoutStateDefinition$getDataStore$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<File> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str) {
            super(0);
            this.$context = context;
            this.$fileKey = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return DataStoreFile.dataStoreFile(this.$context, this.$fileKey);
        }
    }

    private LayoutStateDefinition() {
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public Object getDataStore(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super DataStore<LayoutProto$LayoutConfig>> continuation) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, LayoutProtoSerializer.INSTANCE, null, null, null, new AnonymousClass2(context, str), 14, null);
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    @NotNull
    public File getLocation(@NotNull Context context, @NotNull String fileKey) {
        return DataStoreFile.dataStoreFile(context, fileKey);
    }
}
