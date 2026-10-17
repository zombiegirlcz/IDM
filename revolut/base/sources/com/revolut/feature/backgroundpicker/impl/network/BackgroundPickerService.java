package com.revolut.feature.backgroundpicker.impl.network;

import dn2.a;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/network/BackgroundPickerService;", "", "Lefm/d0;", "", "Ldn2/a;", "getUploadedBackgrounds", "()Lefm/d0;", "", "id", "Lefm/b;", "deleteUploadedBackground", "(Ljava/lang/String;)Lefm/b;", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "fileBody", "uploadBackground", "(Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;)Lefm/b;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BackgroundPickerService {
    @DELETE("/background-banners/{id}")
    @NotNull
    b deleteUploadedBackground(@Path("id") @NotNull String id10);

    @GET("/background-banners")
    @NotNull
    d0<List<a>> getUploadedBackgrounds();

    @PUT("/background-banners")
    @NotNull
    @Multipart
    b uploadBackground(@NotNull @Part("id") RequestBody id10, @NotNull @Part MultipartBody$Part fileBody);
}
