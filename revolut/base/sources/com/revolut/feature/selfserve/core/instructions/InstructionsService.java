package com.revolut.feature.selfserve.core.instructions;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kxc.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/selfserve/core/instructions/InstructionsService;", "", "", "flowType", "sourceType", "documentType", "Lefm/d0;", "", "Lkxc/d;", "getInstructions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_selfserve_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstructionsService {
    @GET("/user/current/submissions/{flowType}/v6/instructions/{sourceType}/{documentType}")
    @NotNull
    d0<List<d>> getInstructions(@Path("flowType") @NotNull String flowType, @Path("sourceType") @NotNull String sourceType, @Path("documentType") @NotNull String documentType);
}
