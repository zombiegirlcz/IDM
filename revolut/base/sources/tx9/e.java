package tx9;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.r;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f275375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f275376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f275377c;
    public final Lazy d;
    public final Lazy e;

    public e(ue0.c recentsStorage) {
        Intrinsics.checkNotNullParameter(recentsStorage, "recentsStorage");
        this.f275375a = recentsStorage;
        final int i = 3;
        this.f275376b = j.b(new Function0(this) { // from class: tx9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275372b;

            {
                this.f275372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_INITIAL_LOAD_TIMESTAMP_V2", Long.TYPE));
                    case 1:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_LAST_TIMESTAMP_V2", Long.TYPE));
                    case 2:
                        return new r(this.f275372b.f275375a.v0(Boolean.FALSE, "REFACTORED_RECENTS_UPDATED_WITH_CONTACT_PERMISSION", Boolean.TYPE));
                    default:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_DEFAULT_TIMESTAMP_V2", Long.TYPE));
                }
            }
        });
        final int i2 = 0;
        this.f275377c = j.b(new Function0(this) { // from class: tx9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275372b;

            {
                this.f275372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_INITIAL_LOAD_TIMESTAMP_V2", Long.TYPE));
                    case 1:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_LAST_TIMESTAMP_V2", Long.TYPE));
                    case 2:
                        return new r(this.f275372b.f275375a.v0(Boolean.FALSE, "REFACTORED_RECENTS_UPDATED_WITH_CONTACT_PERMISSION", Boolean.TYPE));
                    default:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_DEFAULT_TIMESTAMP_V2", Long.TYPE));
                }
            }
        });
        final int i3 = 1;
        this.d = j.b(new Function0(this) { // from class: tx9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275372b;

            {
                this.f275372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_INITIAL_LOAD_TIMESTAMP_V2", Long.TYPE));
                    case 1:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_LAST_TIMESTAMP_V2", Long.TYPE));
                    case 2:
                        return new r(this.f275372b.f275375a.v0(Boolean.FALSE, "REFACTORED_RECENTS_UPDATED_WITH_CONTACT_PERMISSION", Boolean.TYPE));
                    default:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_DEFAULT_TIMESTAMP_V2", Long.TYPE));
                }
            }
        });
        final int i5 = 2;
        this.e = j.b(new Function0(this) { // from class: tx9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f275372b;

            {
                this.f275372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_INITIAL_LOAD_TIMESTAMP_V2", Long.TYPE));
                    case 1:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_LAST_TIMESTAMP_V2", Long.TYPE));
                    case 2:
                        return new r(this.f275372b.f275375a.v0(Boolean.FALSE, "REFACTORED_RECENTS_UPDATED_WITH_CONTACT_PERMISSION", Boolean.TYPE));
                    default:
                        return new r(this.f275372b.f275375a.v0(0L, "REFACTORED_RECENTS_DEFAULT_TIMESTAMP_V2", Long.TYPE));
                }
            }
        });
    }
}
