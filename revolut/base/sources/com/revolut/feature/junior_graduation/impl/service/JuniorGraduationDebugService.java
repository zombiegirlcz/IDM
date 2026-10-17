package com.revolut.feature.junior_graduation.impl.service;

import efm.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_graduation/impl/service/JuniorGraduationDebugService;", "", "Lefm/b;", "confirmGraduation2FaDebugOnly", "()Lefm/b;", "confirmAssetsMigrationDebugOnly", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorGraduationDebugService {
    @POST("youth/graduation/e2e/assets-confirm")
    @NotNull
    b confirmAssetsMigrationDebugOnly();

    @POST("youth/graduation/e2e/identity-confirm")
    @NotNull
    b confirmGraduation2FaDebugOnly();
}
