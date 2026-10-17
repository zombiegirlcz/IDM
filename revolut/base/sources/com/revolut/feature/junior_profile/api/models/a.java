package com.revolut.feature.junior_profile.api.models;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior_profile/api/models/a;", "", "<init>", "()V", "Companion", "a", "Lcom/revolut/feature/junior_profile/api/models/JuniorBankingProfile;", "Lcom/revolut/feature/junior_profile/api/models/c;", "feature_junior_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = b.class)
public abstract class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.junior_profile.api.models.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return b.d;
        }
    }

    private a() {
    }

    public abstract LocalDate a();

    public abstract bj0.b b();

    public abstract String c();

    public abstract String d();

    public abstract String getFirstName();

    public abstract String getPhone();
}
