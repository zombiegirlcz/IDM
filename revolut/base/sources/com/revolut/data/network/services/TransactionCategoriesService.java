package com.revolut.data.network.services;

import com.revolut.data.network.models.budgeting.CreateCustomCategoryDto;
import com.revolut.data.network.models.budgeting.CustomCategoryDto;
import com.revolut.data.network.models.budgeting.DeleteCustomCategoryDto;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00072\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130\u00062\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/TransactionCategoriesService;", "", "Lcom/revolut/data/network/models/budgeting/CreateCustomCategoryDto;", "body", "", "walletId", "Lefm/d0;", "Lcom/revolut/data/network/models/budgeting/CustomCategoryDto;", "createCategory", "(Lcom/revolut/data/network/models/budgeting/CreateCustomCategoryDto;Ljava/lang/String;)Lefm/d0;", "id", "Lefm/b;", "updateCategory", "(Ljava/lang/String;Lcom/revolut/data/network/models/budgeting/CustomCategoryDto;Ljava/lang/String;)Lefm/b;", "Lcom/revolut/data/network/models/budgeting/DeleteCustomCategoryDto;", "deleteCategoryOld", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "deleteCategory", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "", "getCategories", "(Ljava/lang/String;)Lefm/d0;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionCategoriesService {
    @POST("/transaction-categories/custom")
    @NotNull
    d0<CustomCategoryDto> createCategory(@Body @NotNull CreateCustomCategoryDto body, @Query("walletId") String walletId);

    @DELETE("/transaction-categories/custom/{id}")
    @NotNull
    b deleteCategory(@Path("id") @NotNull String id10, @NotNull @Query("walletId") String walletId);

    @DELETE("/transaction-categories/custom/{id}")
    @NotNull
    @d
    d0<DeleteCustomCategoryDto> deleteCategoryOld(@Path("id") @NotNull String id10, @Query("walletId") String walletId);

    @GET("/transaction-categories/custom")
    @NotNull
    d0<List<CustomCategoryDto>> getCategories(@Query("walletId") String walletId);

    @PUT("/transaction-categories/custom/{id}")
    @NotNull
    b updateCategory(@Path("id") @NotNull String id10, @Body @NotNull CustomCategoryDto body, @Query("walletId") String walletId);
}
