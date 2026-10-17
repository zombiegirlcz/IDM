package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import lim.o;
import mmm.g0;
import mmm.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmmm/h0;", "invoke", "()Lmmm/h0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PreferenceDataStoreFactory$create$delegate$1 extends u implements Function0<h0> {
    final /* synthetic */ Function0<File> $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreFactory$create$delegate$1(Function0<? extends File> function0) {
        super(0);
        this.$produceFile = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final h0 invoke() {
        File file = (File) this.$produceFile.invoke();
        if (Intrinsics.f(o.n(file), "preferences_pb")) {
            g0 g0Var = h0.Companion;
            File absoluteFile = file.getAbsoluteFile();
            Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
            return g0.b(g0Var, absoluteFile);
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
