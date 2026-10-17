package com.revolut.feature.form_wizard.impl.network.services;

import efm.b;
import efm.d0;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.c;
import org.jetbrains.annotations.NotNull;
import q90.i;
import q90.l1;
import q90.m;
import q90.s;
import q90.t;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Tag;
import xq6.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\fJ)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\fJ5\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020$2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010&J=\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010'\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b-\u0010.J=\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010/\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b0\u0010.¨\u00061À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/form_wizard/impl/network/services/FormWizardService;", "", "", "id", "", "parameters", "Lefm/d0;", "Lq90/i;", "getForm", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "stepId", "getWorkflowForm", "(Ljava/lang/String;)Lefm/d0;", "informationRequestId", "contentId", "getRfiToolForm", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "form", "submitRfiToolForm", "(Ljava/lang/String;Ljava/lang/String;Lq90/i;)Lefm/d0;", "submitForm", "(Ljava/lang/String;Lq90/i;)Lefm/d0;", "fileId", "Lq90/m;", "validateFileUpload", "submitWorkflowForm", "Lxq6/a;", "submitFormAllowed", "Lokhttp3/c;", "body", "Lj21/c;", "progressCallback", "Lq90/l1;", "uploadFile", "(Ljava/lang/String;Lokhttp3/c;Lj21/c;)Lefm/d0;", "remoteId", "Lefm/b;", "removeFile", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "formId", "viewId", "itemId", "Lq90/s;", "validationParams", "Lq90/t;", "validateFormItemLegacy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq90/s;)Lefm/d0;", "path", "validateFormItem", "feature_form_wizard_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FormWizardService {
    @GET("forms/{id}")
    @NotNull
    d0<i> getForm(@Path("id") @NotNull String id10, @QueryMap @NotNull Map<String, String> parameters);

    @GET("information-requests/{informationRequestId}/contents/{contentId}/form")
    @NotNull
    d0<i> getRfiToolForm(@Path("informationRequestId") @NotNull String informationRequestId, @Path("contentId") @NotNull String contentId);

    @GET("workflows/steps/{stepId}/form")
    @NotNull
    d0<i> getWorkflowForm(@Path("stepId") @NotNull String stepId);

    @DELETE("forms/{formId}/uploads/{remoteId}")
    @NotNull
    b removeFile(@Path("formId") @NotNull String id10, @Path("remoteId") @NotNull String remoteId);

    @POST("forms/{id}/submit")
    @NotNull
    d0<i> submitForm(@Path("id") @NotNull String id10, @Body @NotNull i form);

    @GET("forms/{id}/submit")
    @NotNull
    d0<a> submitFormAllowed(@Path("id") @NotNull String id10);

    @POST("information-requests/{informationRequestId}/contents/{contentId}/form")
    @NotNull
    d0<i> submitRfiToolForm(@Path("informationRequestId") @NotNull String informationRequestId, @Path("contentId") @NotNull String contentId, @Body @NotNull i form);

    @POST("workflows/steps/{stepId}/form")
    @NotNull
    d0<i> submitWorkflowForm(@Path("stepId") @NotNull String stepId, @Body @NotNull i form);

    @POST("forms/{id}/uploads")
    @NotNull
    d0<l1> uploadFile(@Path("id") @NotNull String id10, @Body @NotNull c body, @Tag j21.c progressCallback);

    @GET("forms/{fileId}/validation-results")
    @NotNull
    d0<m> validateFileUpload(@Path("fileId") @NotNull String fileId);

    @POST("{path}/views/{viewId}/items/{itemId}/validate")
    @NotNull
    d0<t> validateFormItem(@Path(encoded = true, value = "path") @NotNull String path, @Path("viewId") @NotNull String viewId, @Path("itemId") @NotNull String itemId, @Body @NotNull s validationParams);

    @POST("forms/{formId}/views/{viewId}/items/{itemId}/validate")
    @NotNull
    d0<t> validateFormItemLegacy(@Path("formId") @NotNull String formId, @Path("viewId") @NotNull String viewId, @Path("itemId") @NotNull String itemId, @Body @NotNull s validationParams);
}
