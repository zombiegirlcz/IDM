package ga1;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lga1/e;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "fileName", "", "Z", "d", "()Z", "rebootRequired", "c", "key", "e", "signature", "", "Ljava/util/List;", "()Ljava/util/List;", "binaryBlocks", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fileName")
    @NotNull
    private final String fileName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("rebootRequired")
    private final boolean rebootRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("signature")
    @NotNull
    private final String signature;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("binaryBlocks")
    @NotNull
    private final List<String> binaryBlocks;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBinaryBlocks() {
        return this.binaryBlocks;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRebootRequired() {
        return this.rebootRequired;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }
}
