package androidx.glance.state;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PreferencesGlanceStateDefinition$getDataStore$2$1 extends u implements Function0<File> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fileKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesGlanceStateDefinition$getDataStore$2$1(Context context, String str) {
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
