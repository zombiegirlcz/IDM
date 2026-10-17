package androidx.glance.state;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/glance/state/PreferencesGlanceStateDefinition;", "Landroidx/glance/state/GlanceStateDefinition;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileKey", "Ljava/io/File;", "getLocation", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "Landroidx/datastore/core/DataStore;", "getDataStore", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferencesGlanceStateDefinition implements GlanceStateDefinition<Preferences> {
    private static CoroutineScope coroutineScope;

    @NotNull
    public static final PreferencesGlanceStateDefinition INSTANCE = new PreferencesGlanceStateDefinition();
    public static final int $stable = 8;

    /* JADX INFO: renamed from: androidx.glance.state.PreferencesGlanceStateDefinition$getDataStore$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function0<File> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, String str) {
            super(0);
            this.$context = context;
            this.$fileKey = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return PreferenceDataStoreFile.preferencesDataStoreFile(this.$context, this.$fileKey);
        }
    }

    private PreferencesGlanceStateDefinition() {
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public Object getDataStore(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super DataStore<Preferences>> continuation) {
        DataStore dataStoreCreate$default;
        CoroutineScope coroutineScope2 = coroutineScope;
        return (coroutineScope2 == null || (dataStoreCreate$default = PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, null, null, coroutineScope2, new PreferencesGlanceStateDefinition$getDataStore$2$1(context, str), 3, null)) == null) ? PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new AnonymousClass3(context, str), 7, null) : dataStoreCreate$default;
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    @NotNull
    public File getLocation(@NotNull Context context, @NotNull String fileKey) {
        return PreferenceDataStoreFile.preferencesDataStoreFile(context, fileKey);
    }
}
