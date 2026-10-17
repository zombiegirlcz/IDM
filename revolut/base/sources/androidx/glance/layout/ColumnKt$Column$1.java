package androidx.glance.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ColumnKt$Column$1 extends q implements Function0<EmittableColumn> {
    public static final ColumnKt$Column$1 INSTANCE = new ColumnKt$Column$1();

    public ColumnKt$Column$1() {
        super(0, EmittableColumn.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final EmittableColumn invoke() {
        return new EmittableColumn();
    }
}
